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
  FCC_RGB;
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
  RENDS = 'RENDS';
  LOOP = 'LOOP';
  HASARD = 'HASARD';
  CAP = 'CAP';
  PI = 'PI';
  PAUSE = 'PAUSE';
  SIN = 'SIN';
  COS = 'COS';
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
REAL : ('0'..'9')+ '.' ('0'..'9')+ ;
WS  :   (' '|'\t'|('\r'? '\n'))+ { skip(); } ;

programme : liste_instructions -> ^(PROGRAMME liste_instructions);
bloc @init {context.newScope();} @after {context.removeScope();}: liste_instructions -> ^(SCOPE liste_instructions);
liste_instructions : (instruction)*;

expr : /*call |*/ recursExpr;
recursExpr : boolExpr ;
boolExpr : sumExpr (('>'|'<'|'='|'<='|'>='|'!='|'&'|'|')^ sumExpr)? ;
sumExpr : multExpr (('+'|'-')^ multExpr)* ;
multExpr : powExpr (('*'|'/'|'MOD')^ powExpr)* ;
powExpr : signedExpr (('^')^ signedExpr)* ;
//signedExpr : ('+'? atom -> atom) | ('-' atom -> ^(U_MOINS atom));
signedExpr : atom;
atom: 
  ':'! id = IDENTIFIER 
  {
		try {
		  context.get($id.getText()); 
		}
		catch ( Exception e ) {
	    Log.appendnl("Parser l. " + $id.getLine() + " : variable " + $id.getText() + " non-definie");
	    valide = false;
    }
  }
  | LOOP {try {context.getLoop();} catch(Exception e) { Log.appendnl("Parser l. " + $LOOP.getLine() + " : LOOP ne peut etre utilise que dans un REPETE"); }}
  | CAP
  | PI
  | INT
  | REAL
  | HASARD^ atom
  | COS^ atom
  | SIN^ atom
  | '('! call ')'!
  | '('! recursExpr ')'! 
;
//atom: INT | '('! expr ')'! ;


deffonction 
@init
{
    Vector<String> params = new Vector<String>();
}
: 
  POUR name=IDENTIFIER (':' id=IDENTIFIER{params.add($id.getText());} -> IDENTIFIER)* {
    context.setFunctionScope($name.getText());
    context.newScope();
    
    for ( int i = 0 ; i < params.size() ; i++ )
    {
      context.setParam(params.elementAt(i), 0);
    }
    
    context.define($name.getText(),params);
  } bloc {context.removeScope(); context.exitFunctionScope();} FIN
  -> ^(POUR $name bloc)
;

call
  @init 
  {
    int count = 0; 
  }
  : 
  name=IDENTIFIER (recursExpr{count++;})*
  {
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
  -> ^(CALL $name (recursExpr)*)
;

affectation : 
  DONNE^ '"'! IDENTIFIER expr { context.set($IDENTIFIER.getText(), 0); }
  | LOCALE^ '"'! IDENTIFIER expr 
    {
      try{ context.setLocal($IDENTIFIER.getText(), 0);}
      catch ( Exception e ) 
      {
	      Log.appendnl("Parser l. " + $IDENTIFIER.getLine() + " : variable locale " + $IDENTIFIER.getText() + " ne peut porter ce nom (existe comme argument de la fonction)");
	      valide = false;
      }
    }
;

repete @init{context.incLoop();} : 
  (REPETE^ expr '['! bloc ']'! )
;

tantque :
  (TANTQUE^ expr '['! bloc ']'! )
;

si :
  SI^ expr '['! bloc ']'! ('['! bloc ']'!)?
;

rends : 
  RENDS^ expr
;

instruction :
  affectation | repete | si | tantque | deffonction | call | rends
  | 
  ( AV^ | TD^ | TG^ | REC^| FCAP^ | FCC^ | PAUSE^) expr 
  |
  ( FPOS^ '['! expr expr ']'!) 
  |
  (FCC '[' a=expr b=expr c=expr ']' -> ^(FCC_RGB $a $b $c))
  |
  (VE^ | BC^ | LC^)
;
