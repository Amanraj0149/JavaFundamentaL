package ClassInsideClass;

class A
{
    int age;
    public void show()
    {
        System.out.println("in show");
    }
    static class B  // isko call karne ke liye object banane ka jarurat nhi
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}

public class ClassInsideC {
   public static void main(String[] args){
    A obj=new A();
    obj.show();
//  A.B obj1= new B(); 🚫 Error dega kyuki b ka object nhi bana sakte , to usko static declare kardie
    A.B obj1 = new A.B(); 
    obj1.config();
   }

} 


// If inner class is static, use: OuterClass.InnerClass obj = new OuterClass.InnerClass();
// If inner class is non-static, use: OuterClass.InnerClass obj = outerObj.new InnerClass();
// Static inner classes do NOT need outer class object to be created
