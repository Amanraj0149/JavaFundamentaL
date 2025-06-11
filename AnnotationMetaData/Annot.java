package AnnotationMetaData;


//
//@Deprecated
class A{
   public void showTheDataBelongsToThisClass(){ // isme belongs hai
     System.out.println("in a Show");
   }
}

class B extends A{
   @Override  // jaise hi ye anotaion lekhenge , humko error pata chaljayega
   public void showTheDataBelongToThisClass(){ // isme belong hai , type mistake
    System.out.println("is B show");
   }
}

// humko oveeriding karna hai , lekin method name mai belongs wala call kiye
// Tab use ayega Annotaion ka;
// hum direct @override likh denge;

public class Annot {
    public static void main(String[] args){
       B obj=new B();
         obj.showTheDataBelongsToThisClass();
    }
}
