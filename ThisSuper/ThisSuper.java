package ThisSuper;

class A     //  a  is superclass here
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
    super(); //  har constuctor mai hota hai dikhta nhi hai;
    // Iska kam hai superclass ko call karna;
    System.out.println("in B int");
  }

}


public class ThisSuper {
    
    public static void main(String[] args) {
        // B obj= new B(); 
        B obj= new B(5); //  creating an object for class B , and calling parameterize constructor as I pass value 5;
    }
}


// START READING FROM HERE:-

//1) hum object create kar rahe hai class B ke liye;  B obj= new B(); 
//2) Execute karne pe constructor a bhi chal gya & b to chalega hi , uska hi to object create kiye;
//3) output mila:- in A
//                 in B;

// LEKIN A KA CONSTRUCTOR CHALA KAISE ???? 

// Every constructure in java have method super;

// bcz of super present in Consturctor B , super calling class a ;
// Thats why, Class A is executed first;

// but parameterize A will not call , but if we want to call
// Parametrize cONSTRUCTOR A;
// THEN make super() as :- super(n);
// Ex:-
//    public B(int n)
//   {
//     super(n); 
// 
//    System.out.println("in B int");
//   }
//  
//  o/p:- in A int
//        in B int



