package MethodOver;



//       Yaha  MethoDOverriding hua hai;

class A{
    public void show()
    {
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in A Config");
    }
}
class B extends A{

    public void show()
    {
       System.out.println("in B show"); 
    }
}

public class MethodOverriding {
    public static void main(String args[]){
        B obj=new B();
        obj.show(); // 
        obj.config();
    }
}
