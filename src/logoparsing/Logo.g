grammar Logo;
options {
  output = AST;
}
tokens {
  PROGRAMME;
  CALL;
  SCOPE;
  VALUES;
  PARAMETERS;
  U_MOINS;
  AV = 'AV' ;
  TD = 'TD' ;
  TG = 'TG' ;
  REC = 'REC' ;
  VE = 'VE' ; 
  LC = 'LC' ;
  BC = 'BC' ;
  FPOS = 'FPOS' ;
  FCAP = 'FCAP';
  FCC = 'FCC';
  DONNE = 'DONNE';
  LOCALE = 'LOCALE';
  REPETE = 'REPETE';
  SI = 'SI';
  TANTQUE = 'TANTQUE';
  POUR = 'POUR';
  FIN = 'FIN';
}
@lexer::header {
  package logoparsing;
}
@header {
  package logoparsing;
  import utilities.Context;
  import logogui.Log;
  import java.util.Vector;
}
@members{
  private Context context = new Context();
  private boolean valide = true;
  
  public boolean getValide()
  {
    return valide;
  }
  
  public Context getContext()
  {
    return context;
  }
}

IDENTIFIER : ('A'..'Z'|'a'..'z')('_'|'0'..'9'|'A'..'Z'|'a'..'z')*;
//INT : ('+'|'-')?('0'..'9')+ ;
INT : ('0'..'9')+ ;
WS  :   (' '|'\t'|('\r'? '\n'))+ { skip(); } ;

programme : liste_instructions -> ^(PROGRAMME liste_instructions);
bloc @init {context.newScope();} @after {context.removeScope();}: liste_instructions -> ^(SCOPE liste_instructions);
bloc_parametres : liste_parametres -> ^(PARAMETERS liste_parametres);
bloc_valeurs : liste_valeurs -> ^(VALUES liste_valeurs);

liste_instructions : (instruction)*;
liste_parametres : (':'! IDENTIFIER)*;
liste_valeurs : (expr)*;

expr : boolExpr ;
boolExpr : sumExpr (('>'|'<'|'='|'<='|'>='|'!='|'&'|'|')^ sumExpr)? ;
sumExpr : multExpr (('+'|'-')^ multExpr)* ;
multExpr : powExpr (('*'|'/')^ powExpr)* ;
powExpr : atom ('^'^ atom)* ;
atom: 
  ':'! id = IDENTIFIER 
  {
		try {
		  context.get($id.getText()); 
		}
		catch ( Exception e ) {
	    Log.append("Parser l. " + $id.getLine() + " : variable " + $id.getText() + " non-definie\n");
	    valide = false;
    }
  }
  | INT 
  | '+' INT -> INT 
  | '-' INT -> ^(U_MOINS INT) 
  | '('! expr ')'! 
;
//atom: INT | '('! expr ')'! ;


deffonction : 
  POUR^ name=IDENTIFIER bp=bloc_parametres bloc FIN!
  {
    CommonTree pnode = (CommonTree)bp.getTree();
    Vector<String> params = new Vector<String>();
    
    for ( int i = 0 ; i < pnode.getChildCount() ; i++ )
      params.add(pnode.getChild(i).getText());
    
    context.define($name.getText(),params);
  }
;

call : 
  name=IDENTIFIER bv=bloc_valeurs
  {
    int count = (bv != null && bv.getTree() != null) ? ((CommonTree)bv.getTree()).getChildCount() : 0;
     
    if ( context.callable($name.getText()) == false )  
    {
      Log.appendnl("Parser l. " + $name.getLine() + " : fonction " + $name.getText() + " non-definie\n");
      valide = false;
    }
    else if ( context.getParameters($name.getText()).size() != count )  
    {
      Log.appendnl("Parser l. " + $name.getLine() + " : fonction " + $name.getText() + " prend " + context.getParameters($name.getText()).size() + " argument(s)");
      valide = false;
    }
  }  
  -> ^(CALL $name bloc_valeurs)
;

affectation : 
  DONNE^ '"'! IDENTIFIER expr { context.set($IDENTIFIER.getText(), 0); }
  | LOCALE^ '"'! IDENTIFIER expr { context.setLocal($IDENTIFIER.getText(), 0); }
;

repete :
  (REPETE^ expr '['! bloc ']'! )
;

tantque :
  (TANTQUE^ expr '['! bloc ']'! )
;

si :
  SI^ expr '['! bloc ']'! ('['! bloc ']'!)?
;

instruction :
  affectation | repete | si | tantque | deffonction | call
  | 
  ( AV^ | TD^ | TG^ | REC^| FCAP^ | FCC^) expr 
  |
  ( FPOS^ '['! expr expr ']'!) 
  |
  (VE^ | BC^ | LC^)
;
