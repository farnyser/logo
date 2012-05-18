tree grammar LogoTree;
options {
  tokenVocab = Logo;
  ASTLabelType=CommonTree;
}
@header {
  package logoparsing;
  import java.util.Random;
  import utilities.Context;
  import logogui.Traceur;
  import logogui.Log;
}
@members{
  Traceur traceur;
  Context context;
  Random generator;
    
  public void initialize(java.awt.Graphics g, Context c) 
  {
    generator = new Random();
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
  public void rewind(int index) { 
    ((CommonTreeNodeStream)input).rewind(index); 
  }
}

prog : ^(PROGRAMME (instruction)*);

bloc : ^(SCOPE (instruction)*);

expr returns [double v] :
^('+' x=expr y=expr) {$v = $x.v + $y.v;}
| ^('-' x=expr y=expr) {$v = $x.v - $y.v;}
| ^(U_MOINS x=expr) {$v = - $x.v;}
| ^('MOD' x=expr y=expr) {$v = (int)$x.v \% (int)$y.v; }
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
| ^(HASARD x=expr) {$v = generator.nextInt((int)$x.v);} 
| PI {$v = new Double(3.14957);}
| INT {$v = Double.parseDouble($INT.text);}
| REAL {$v = Double.parseDouble($REAL.text);}
| CAP {$v = traceur.getTeta();}
| id = IDENTIFIER {
	  try {
	    $v = context.get($id.getText()); 
	   }
	   catch ( Exception e ) {
	      Log.appendnl("TreeParser l. " + $id.getLine() + " : variable " + $id.getText() + " non-definie");
	   }
   }
| LOOP { 
	  try { 
	    $v = context.getLoop();
	  } 
	  catch ( Exception e ) {
	    Log.appendnl("TreeParser : LOOP inutilisable ici");
	  } 
  }
| call {$v = context.getReturnValue();}
;


repete 
  @init
  {
    int mark_list = 0;
  } 
  : ^(REPETE n = expr {mark_list = input.mark();} . )
  {
    context.newScope();
    for (int i = 0; i < $n.v ; i++) 
    {
      Log.appendnl("TreeParser : repete iteration " + i);
      context.incLoop();
      push(mark_list);
      bloc();
      pop();
    }
    context.removeScope();
  }
;


tantque 
  @init
  {
    int cond = 0, bloc = 0;
  } 
  : ^(TANTQUE {cond = input.mark();} . {bloc = input.mark();} . )
  {
    boolean x = true;
    while ( x ) 
    {
      push(cond+1);
      x = expr() != 0;
      pop();
    
      if ( x ) 
      {
	      push(bloc);
	      bloc();
	      pop();
      }
    }
  }
;


si 
  @init
  {
    int bif = 0, belse = 0;
  } 
  : 
  ^(SI n=expr {bif = input.mark();} . ({belse = input.mark();} els=.)?)
  {
    if ( $n.v != 0 ) { push(bif); bloc(); pop(); }
    else if ($els != null) { push(belse); bloc(); pop(); }
  }
;


deffonction 
  @init
  {
    int mark_a = 0;
  } 
  : ^(POUR name=IDENTIFIER {mark_a = input.mark();} a=. )
  {
      context.setFunctionMark($name.getText(),mark_a);
  }
;

call 
  @init
  {
    Stack<Double> values = new Stack<Double>();
    int mark_fin = 0;
  }
  : ^(CALL name=IDENTIFIER (e=expr{values.add(new Double($e.v));})* {mark_fin = input.mark();})
  {
    context.call(this,mark_fin,$name.getText(),values);
  }
;

rends : ^(RENDS e=expr) { context.returnValue(this,$e.v); };

instruction :
 repete 
 | tantque
 | si
 | deffonction
 | call
 | rends
 | ^(DONNE i = IDENTIFIER a = expr) { context.set($i.getText(), $a.v);}
 | ^(LOCALE i = IDENTIFIER a = expr) { try { context.setLocal($i.getText(), $a.v); } catch ( Exception e ) {} }
 | ^(AV a = expr) {traceur.avance($a.v);}
 | ^(TD a = expr) {traceur.td($a.v);}
 | ^(TG a = expr) {traceur.tg($a.v);}
 | ^(REC a = expr) {traceur.avance(-$a.v);}
 | ^(FCAP a = expr) {traceur.setTeta($a.v);}
 | ^(PAUSE a = expr) {try{Thread.currentThread().sleep((long)$a.v);}catch(InterruptedException ie){}}
 | ^(FCC a = expr) {traceur.setColor($a.v);}
 | ^(FCC_RGB a = expr b = expr c = expr) {traceur.setColor($a.v,$b.v,$c.v);}
 | ^(FPOS a = expr b = expr) { traceur.setPos($a.v,$b.v); }
 | BC {traceur.setTrace(true);}
 | LC {traceur.setTrace(false);}
 | VE {traceur.clean();}
;