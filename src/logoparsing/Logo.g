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
  RENDS = 'RENDS';
  LOOP = 'LOOP';
  HASARD = 'HASARD';
  CAP = 'CAP';
  PI = 'PI';
  PAUSE = 'PAUSE';
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

expr : HASARD? boolExpr ;
boolExpr : sumExpr (('>'|'<'|'='|'<='|'>='|'!='|'&'|'|')^ sumExpr)? ;
sumExpr : multExpr (('+'|'-')^ multExpr)* ;
multExpr : powExpr (('*'|'/'|'MOD')^ powExpr)* ;
powExpr : atom ('^'^ atom)* ;
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
  | '+' INT -> INT 
  | '-' INT -> ^(U_MOINS INT) 
  | '('! expr ')'! 
;
//atom: INT | '('! expr ')'! ;


deffonction 
@init
{
    Vector<String> params = new Vector<String>();
}
: 
  POUR name=IDENTIFIER (':' id=IDENTIFIER{params.add($id.getText());} -> IDENTIFIER)* {
    context.newScope();
    
    for ( int i = 0 ; i < params.size() ; i++ )
    {
      context.set(params.elementAt(i), 0);
    }
    
    context.define($name.getText(),params);
  } bloc {context.removeScope();} FIN
  -> ^(POUR $name ^(VALUES IDENTIFIER*) bloc)
;

call
  @init 
  {
    int count = 0; 
  }
  : 
  name=IDENTIFIER (expr{count++;})*
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
  -> ^(CALL $name (expr)*)
;

affectation : 
  DONNE^ '"'! IDENTIFIER expr { context.set($IDENTIFIER.getText(), 0); }
  | LOCALE^ '"'! IDENTIFIER expr { context.setLocal($IDENTIFIER.getText(), 0); }
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
  (VE^ | BC^ | LC^)
;
