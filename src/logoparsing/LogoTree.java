// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Claude Moulin\\cm-data\\cm-workspace-nf11\\tp2-2011\\src\\logoparsing\\LogoTree.g 2011-03-16 15:22:27

  package logoparsing;
  import logogui.Traceur;
  import logogui.Log;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LogoTree extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PROGRAMME", "AV", "TD", "INT", "WS"
    };
    public static final int EOF=-1;
    public static final int PROGRAMME=4;
    public static final int AV=5;
    public static final int TD=6;
    public static final int INT=7;
    public static final int WS=8;

    // delegates
    // delegators


        public LogoTree(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public LogoTree(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return LogoTree.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Claude Moulin\\cm-data\\cm-workspace-nf11\\tp2-2011\\src\\logoparsing\\LogoTree.g"; }


      Traceur traceur;
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



    // $ANTLR start "prog"
    // C:\\Users\\Claude Moulin\\cm-data\\cm-workspace-nf11\\tp2-2011\\src\\logoparsing\\LogoTree.g:24:2: prog : ^( PROGRAMME ( instruction )* ) ;
    public final void prog() throws RecognitionException {
        try {
            // C:\\Users\\Claude Moulin\\cm-data\\cm-workspace-nf11\\tp2-2011\\src\\logoparsing\\LogoTree.g:24:7: ( ^( PROGRAMME ( instruction )* ) )
            // C:\\Users\\Claude Moulin\\cm-data\\cm-workspace-nf11\\tp2-2011\\src\\logoparsing\\LogoTree.g:24:9: ^( PROGRAMME ( instruction )* )
            {
            match(input,PROGRAMME,FOLLOW_PROGRAMME_in_prog42); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Users\\Claude Moulin\\cm-data\\cm-workspace-nf11\\tp2-2011\\src\\logoparsing\\LogoTree.g:24:21: ( instruction )*
                loop1:
                do {
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( ((LA1_0>=AV && LA1_0<=TD)) ) {
                        alt1=1;
                    }


                    switch (alt1) {
                	case 1 :
                	    // C:\\Users\\Claude Moulin\\cm-data\\cm-workspace-nf11\\tp2-2011\\src\\logoparsing\\LogoTree.g:24:22: instruction
                	    {
                	    pushFollow(FOLLOW_instruction_in_prog45);
                	    instruction();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop1;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }
            Log.appendnl("Programme principal");

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "prog"


    // $ANTLR start "instruction"
    // C:\\Users\\Claude Moulin\\cm-data\\cm-workspace-nf11\\tp2-2011\\src\\logoparsing\\LogoTree.g:27:1: instruction : ( ^( AV a= INT ) | ^( TD a= INT ) );
    public final void instruction() throws RecognitionException {
        CommonTree a=null;

        try {
            // C:\\Users\\Claude Moulin\\cm-data\\cm-workspace-nf11\\tp2-2011\\src\\logoparsing\\LogoTree.g:27:13: ( ^( AV a= INT ) | ^( TD a= INT ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==AV) ) {
                alt2=1;
            }
            else if ( (LA2_0==TD) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Claude Moulin\\cm-data\\cm-workspace-nf11\\tp2-2011\\src\\logoparsing\\LogoTree.g:28:4: ^( AV a= INT )
                    {
                    match(input,AV,FOLLOW_AV_in_instruction68); 

                    match(input, Token.DOWN, null); 
                    a=(CommonTree)match(input,INT,FOLLOW_INT_in_instruction74); 

                    match(input, Token.UP, null); 
                    double m = Double.parseDouble(a.getText()); traceur.avance(m);

                    }
                    break;
                case 2 :
                    // C:\\Users\\Claude Moulin\\cm-data\\cm-workspace-nf11\\tp2-2011\\src\\logoparsing\\LogoTree.g:29:4: ^( TD a= INT )
                    {
                    match(input,TD,FOLLOW_TD_in_instruction83); 

                    match(input, Token.DOWN, null); 
                    a=(CommonTree)match(input,INT,FOLLOW_INT_in_instruction89); 

                    match(input, Token.UP, null); 
                    double m = Double.parseDouble(a.getText()); traceur.td(m);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "instruction"

    // Delegated rules


 

    public static final BitSet FOLLOW_PROGRAMME_in_prog42 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_instruction_in_prog45 = new BitSet(new long[]{0x0000000000000068L});
    public static final BitSet FOLLOW_AV_in_instruction68 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_instruction74 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TD_in_instruction83 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_instruction89 = new BitSet(new long[]{0x0000000000000008L});

}