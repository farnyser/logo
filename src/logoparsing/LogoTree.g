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
  Context context;
  
  public void initialize(java.awt.Graphics g, Context c) 
  {
    context = c;
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

prog : ^(PROGRAMME (instruction)*);

bloc : ^(SCOPE (instruction)*);

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
| id = IDENTIFIER {
  try {
    $v = context.get($id.getText()); 
   }
   catch ( Exception e ) {
      Log.appendnl("TreeParser l. " + $id.getLine() + " : variable " + $id.getText() + " non-definie");
   }
};


repete 
  @init
  {
    int mark_list = 0;
  } 
  : ^(REPETE n = expr {mark_list = input.mark();} . )
  {
    for (int i = 0; i < $n.v ; i++) 
    {
      Log.appendnl("TreeParser : repete iteration " + i);
      push(mark_list);
      bloc();
      pop();
    }
  }
;


si 
  @init
  {
    int bif = 0, belse = 0;
  } 

  : ^(SI n=expr {bif = input.mark();} . {belse = input.mark();} .)
  {
    if ( $n.v != 0 ) { push(bif); bloc(); pop(); }
    else { push(belse); bloc(); pop(); }
  }
;



instruction :
 repete 
 | si
 | ^(DONNE i = IDENTIFIER a = expr) { context.set($i.getText(), $a.v);}
 | ^(AV a = expr) {traceur.avance($a.v);}
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