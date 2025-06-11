package InterfaceClass;


//in interface class all the methods are public abstract by default;
// ALL the variable inside Interface are FINAL & STATIC

interface A
{
    // int age; 🚫 ERROR;
    int age=44;     // Final & static;
    String area="Mumbai";

//  public abstract void show(); In interface, methods are by default  public abstract
 void config();
 void show();
}

interface X
{
    void run();
}
interface Y extends X
{

}

class B implements A,X // here we can implement multiple mwthod at same time;
{
   public  void show()
    {
       System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
    public void run(){
        System.out.println("in running");
    }
}

public class InterfaceC {
    public static void main(String[] args) {
        A obj;
        obj= new B();
        obj.show();
        obj.config();


  //   A.area="delhi"; 🚫as in interface VARAIABLE ARE final we cannot change value;
        System.out.println(A.area);
    }
}


// Interface donn't have memory in there heap;

// class-> class = extends;
// class -> interface = implements;
// interface->interface= extends;