grammar Logo;
options {
  output = AST;
}
tokens {
  PROGRAMME;
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
}
@lexer::header {
  package logoparsing;
}
@header {
  package logoparsing;
}
@members{
  boolean valide = true;
  public boolean getValide(){
   return valide;
 }
}

IDENTIFIER : ('a'..'z')('_'|'0'..'9'|'a'..'z')*;
INT : ('0'..'9')+ ;
WS  :   (' '|'\t'|('\r'? '\n'))+ { skip(); } ;

programme : liste_instructions -> ^(PROGRAMME liste_instructions)
;

liste_instructions :
  (instruction)+   
;

expr : boolExpr ;
boolExpr : sumExpr (('>'|'<'|'='|'<='|'>='|'!='|'&'|'|')^ sumExpr)? ;
sumExpr : multExpr (('+'|'-')^ multExpr)* ;
multExpr : powExpr (('*'|'/')^ powExpr)* ;
powExpr : atom ('^'^ atom)* ;
atom: INT | '+' INT -> INT | '-' INT -> ^(U_MOINS INT) | '('! expr ')'! ;
//atom: INT | '('! expr ')'! ;



instruction :
  ( AV^ | TD^ | TG^ | REC^| FCAP^ | FCC^) expr 
  |
  ( FPOS^ '['! expr expr ']'!) 
  |
  (VE | BC | LC) 
;
   