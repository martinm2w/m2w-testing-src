package Testing._05_FlowCtrl_Exp_Assertion.FlowControl;

/**
 * 
 * @author [Ruobo + m2w]
 * @author [Jul 26, 2011 - 1:33:03 PM]
 */
public class TestingSwitchingWrappers {
       static final Integer aa = 1;
    public static void main(String[] args){
        
        Short b = 0;
        final long d = 1;
        final int c = 1;
        final Integer a = 1;
        final Short e = 1;
        final short ee =1;
//        switch(a){}
        switch(b){
            case c: System.out.println();
//            case d: ; // Short -> long
//            case a: ; // wrapper widening
        }
        switch(c){
//            case e: ;
            case ee: ;
//            case aa: ;
        }
        try{}catch(Exception dd){}
    }
}
