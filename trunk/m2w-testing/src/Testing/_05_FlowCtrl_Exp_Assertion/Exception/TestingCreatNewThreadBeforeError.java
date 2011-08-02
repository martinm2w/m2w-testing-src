package Testing._05_FlowCtrl_Exp_Assertion.Exception;

/**
 *
 * @author [Ruobo + m2w]
 * @date [Jul 27, 2011 - 2:19:51 PM]
 */
public class TestingCreatNewThreadBeforeError {
    public static void main(String[] args) throws Exception{
        Thread a = new Thread(new $Testing_CrNewThrBeforError());
        a.start();
//        throw new Error();
//        throw new RuntimeException();
        throw new Exception();
//        System.out.println();
    }
}

class $Testing_CrNewThrBeforError implements Runnable{
    @Override
    public void run(){
        System.out.println("new thread");
        System.out.println(Thread.currentThread().getId());
        Thread a = new Thread(new $Testing_CrNewThrBeforError());
        a.start();
        throw new Error();
    }
}
