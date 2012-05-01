tree grammar LogoTree;
options {
  tokenVocab = Logo;
  ASTLabelType=CommonTree;
}
@header {
  package logoparsing;
  import utilities.Context;
  import logogui.Traceur;
  import logogui.Log;
}
@members{
  Traceur traceur;
  Context context = new Context();
  
  public void initialize(java.awt.Graphics g) {
    traceur = Traceur.getInstance();
    traceur.setGraphics(g);
  }
    public void push(int index) {
     ((CommonTreeNodeStream)input).push(index);
  }
  public void pop() {
     ((CommonTreeNodeStream)input).pop();
  }
}
 prog : ^(PROGRAMME (instruction)*) 
     {Log.appendnl("Programme principal");}
;

expr returns [double v] :
^('+' x=expr y=expr) {$v = $x.v + $y.v;}
| ^('-' x=expr y=expr) {$v = $x.v - $y.v;}
| ^(U_MOINS x=expr) {$v = - $x.v;}
| ^('*' x=expr y=expr) {$v = $x.v * $y.v;}
| ^('/' x=expr y=expr) {$v = $x.v / $y.v;}
| ^('^' x=expr y=expr) {$v = Math.exp($y.v * Math.log($x.v));}
| ^('<' x=expr y=expr) {$v = ($x.v < $y.v) ? 1 : 0;}
| ^('<=' x=expr y=expr) {$v = ($x.v <= $y.v) ? 1 : 0;}
| ^('>' x=expr y=expr) {$v = ($x.v > $y.v) ? 1 : 0;}
| ^('>=' x=expr y=expr) {$v = ($x.v >= $y.v) ? 1 : 0;}
| ^('=' x=expr y=expr) {$v = ($x.v == $y.v) ? 1 : 0;}
| ^('!=' x=expr y=expr) {$v = ($x.v != $y.v) ? 1 : 0;}
| ^('|' x=expr y=expr) {$v = ($x.v != 0 || $y.v != 0) ? 1 : 0;}
| ^('&' x=expr y=expr) {$v = ($x.v !=0 && $y.v != 0) ? 1 : 0;}
| INT {$v = Double.parseDouble($INT.text);}
| IDENTIFIER {
  try {
    $v = context.get($IDENTIFIER.getText()); 
   }
   catch ( Exception e ) {
    Log.append("TreeParser : variable " + $IDENTIFIER.getText() + " non-definie\n");
   }
};


instruction :
   ^(DONNE i = IDENTIFIER a = expr) { context.set($i.getText(), $a.v);}
 |  ^(AV a = expr) {traceur.avance($a.v);}
 | ^(TD a = expr) {traceur.td($a.v);}
 | ^(TG a = expr) {traceur.tg($a.v);}
 | ^(REC a = expr) {traceur.avance(-$a.v);}
 | ^(FCAP a = expr) {traceur.setTeta($a.v);}
 | ^(FCC a = expr) {traceur.setColor($a.v);}
 | ^(FPOS a = expr b = expr) { traceur.setPos($a.v,$b.v); }
 | BC {traceur.setTrace(true);}
 | LC {traceur.setTrace(false);}
 | VE {traceur.clean();}
;