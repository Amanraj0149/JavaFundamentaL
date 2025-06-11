package TypeCasting;

class A
{
  public void show1()
  {
    System.out.println("in A Show");
  }
}

class B extends A
{
   public void show2()
   {
    System.out.println("in B show");
   }
}


public class TypeCast {
    public static void main(String[] args) {
        double d=4.5;
        int i=(int) d; // yaha typecasting kiye hai;
       

                         //upCasting;

     A obj= (A) new B();  
     obj.show1();

                       // Downcasting;

//     obj.show2(); it gives 🚫 error

//     we have taken obj as refrence of A, & A Have no idea about show2

// To solve this problem:-

//   B obj1= obj;
//   obj.show2(); it gives 🚫 error, as obj as refernce as A

    B obj1=(B) obj; // we have done ✅ DownCasting here;
    obj1.show2();
   



       
    }
}
