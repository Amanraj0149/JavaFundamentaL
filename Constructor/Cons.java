package Constructor;
class Human
{
   
    public Human()
    {
     System.out.println("in constructor");
    }
}

public class Cons {
    public static void main(String[] args)
    {
     Human obj= new Human();
 
// whenever object is created , constuctor called automatically;
// "in constructor":- this will get print when we execute the code;

      Human obj1= new Human();
// everytime when we create object , it create new constructor,
//"in constructor" this will get print 2 times when we execute the code;
    }
    }

    //output:-  in constructor
    //           in constructor

