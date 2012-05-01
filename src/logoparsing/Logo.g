grammar Logo;
options {
  output = AST;
}
tokens {
  PROGRAMME;
  SCOPE;
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
  REPETE = 'REPETE';
  SI = 'SI';
}
@lexer::header {
  package logoparsing;
}
@header {
  package logoparsing;
  import utilities.Context;
  import logogui.Log;
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

IDENTIFIER : ('a'..'z')('_'|'0'..'9'|'a'..'z')*;
//INT : ('+'|'-')?('0'..'9')+ ;
INT : ('0'..'9')+ ;
WS  :   (' '|'\t'|('\r'? '\n'))+ { skip(); } ;

programme : liste_instructions -> ^(PROGRAMME liste_instructions);
bloc @init {context.newScope();} @after {context.removeScope();}: liste_instructions -> ^(SCOPE liste_instructions);

liste_instructions :
  (instruction)*
;

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


affectation : DONNE^ '"'! IDENTIFIER expr { context.set($IDENTIFIER.getText(), 0); };

repete :
  (REPETE^ expr '['! bloc ']'! )
;

si :
  SI^ expr '['! bloc ']'! ('['! bloc ']'!)?
;

instruction :
  affectation | repete | si
  | 
  ( AV^ | TD^ | TG^ | REC^| FCAP^ | FCC^) expr 
  |
  ( FPOS^ '['! expr expr ']'!) 
  |
  (VE^ | BC^ | LC^)
;
