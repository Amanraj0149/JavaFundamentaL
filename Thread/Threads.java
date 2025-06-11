package Thread;

class A extends Thread{     //  yaha extends kardiye threads se

    // IN every thread we need to have run method;

    public void run()
    {
        for(int i=0;i<=100;i++){
            System.out.println("hi");
            // hum thoda sa delay karwa die idhar exceute hone mai;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{

    public void run()
    {
        for(int i=0;i<=100;i++){
            System.out.println("hELLO");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        // we want to execute to object at same time ,we can use:- Threads

        A obj1= new A();
        B obj2= new B();

        System.out.println(obj1.getPriority());

        // WE CAN SET PRIORITY OF THREAD;
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.run();
        try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
               
                e.printStackTrace();
            }
        obj2.run();
    }
}
