package Thread;

public class LambdaExpress {
     public static void main(String[] args) {
        // Anonymous inner class
        Runnable obj1 = () ->  // lambada Expression;
        {  
            
                for (int i = 1; i <= 100; i++) {
                    System.out.println("hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            
        };

        Runnable obj2 = () ->
        {
            for(int i=1;i<=100;i++){
                System.out.println("hello");
               try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();  // ✅ Now inside main method
        t2.start();
    }
}
