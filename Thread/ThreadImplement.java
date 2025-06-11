package Thread;

class A implements Runnable{
 public void run(){
     for(int i=1;i<=5;i++){
        System.out.println("hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
              
                e.printStackTrace();
            }
        
     
     }
 }
}
class B implements Runnable{
 public void run(){
     for(int i=1;i<=5;i++){
        System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
              
                e.printStackTrace();
            }
        }
}
}

public class ThreadImplement {
     
public static void main(String[] args) {
     Runnable obj1= new A();
    Runnable  obj2= new B();

     Thread t1= new Thread(obj1);
     Thread t2= new Thread(obj2);

     t1.start();
     t2.start();

}
}


/*
 * Summary of the Java Multi-threading Program:
 * 
 * 1. Two classes, A and B, implement the Runnable interface,
 *    each defining a run() method that prints a message 5 times.
 * 
 * 2. Each run method includes a short delay (Thread.sleep(10)) 
 *    between prints to simulate work.
 * 
 * 3. In main(), objects of A and B are wrapped in Thread objects and started.
 * 
 * 4. Both threads run concurrently, so their outputs ("hi" and "hello") 
 *    appear interleaved in a non-deterministic order.
 * 
 * 5. This program demonstrates basic multi-threading using Runnable,
 *    showing parallel execution controlled by the JVM thread scheduler.
 */
