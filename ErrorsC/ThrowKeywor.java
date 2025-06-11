package ErrorsC;
class NavinException extends Exception{    // navin naam ka eception banaye, usme exception ka property load kiye extend karke,
   public NavinException(String string){  // super class call karega parent class ko usme , string message jayega jo, catch se call hua
     super(string);
   }
}
public class ThrowKeywor {
        public static void main(String[] args) {
        int i=20;
        int j=0;
        
        try
        {
           j=8/i;
           if(j==0)  
           // creating my own Exception;
           throw  new NavinException("i dont want to print zero");              
        }

      //   catch(ArithmeticException e)
      //   {
      //       j=18/1;
      //      System.out.println("thats the default output....." + e);
      //   }

      catch(NavinException e)
        {
            j=18/1;
           System.out.println("thats the default output....." + e);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
           System.out.println("Stay in your limits" + e);
        }
         catch(Exception e)
        {
           System.out.println("Something went Wrong...." + e);
        }

        System.out.println(j); 

        System.out.println("Bye"); 
    }
}

