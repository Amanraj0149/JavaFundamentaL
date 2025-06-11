package NamingConvention;

class A
{

    public A()
    {
         System.out.println("Object created successfully");
    }

 public void show()
 {
    System.out.println("in a show");
 }
}



public class CamelCase {

    public static void main(String[] args){

        // new A();   // anonymous object , ye direct ek dabaa banayega heap memory mai;
           new A().show();

        
    }
    
}











// Camel Casing

// class and interface - cALC, runnable;
// variable and method - marks, show()
// constants- PIE, BRAND


// showMyMarks()   ✅
// show_my_marks() ✅

//MyData :- ye classname hai;

//age ,DATA :- CONSTATNTS;

// Human() :- this is a constructor;