package ThisSuper;

class A     //  a  is superclass
{
 public A()
 {
    super();
   System.out.println("in A");
 }

  public A(int n)
 {
    super();
   System.out.println("in A int");
 }

}

class B extends A      // B sublclass hai
{
  public B()    // ye construictor execute hoga  b ka object create karne ke sath hi
  {
    super();
    System.out.println("in b");
  }

  public B(int n)
  {
    this();  // will execute the constructor of same class;
    System.out.println("in B int");
  }

}
public class ThisConstructor {
     public static void main(String[] args) {
        // B obj= new B(); 
        B obj= new B(5); 
    }
}


//  this();  will execute the constructor of same class;
//  o/p:-
//    in A
//    in b
//    in B int
//
//
//