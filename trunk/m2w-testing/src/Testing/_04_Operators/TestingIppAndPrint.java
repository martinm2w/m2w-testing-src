package Testing._04_Operators;

/**
 * 
 * @author [Ruobo + m2w]
 * @author [Aug 5, 2011 - 11:56:25 AM]
 */
public class TestingIppAndPrint implements Runnable {
static Thread t1;
static int x = 5;
public void run() {
if(Thread.currentThread().getId() == t1.getId()) shove();
else push();
}

static synchronized void push() { shove(); }
static void shove() {
synchronized(TestingIppAndPrint.class) {
System.out.println(x-- + " " + Thread.currentThread().getName());
try { Thread.sleep(2000); } catch (Exception e) { ; }
if(x > 0) push();
} }
 public static void main(String[] args) {
t1 = new Thread(new TestingIppAndPrint() , "t1");
t1.start();
new Thread(new TestingIppAndPrint() , "t2").start();
} }
