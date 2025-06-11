package ErrorsC;

public class HandleExcep {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int num[] = new int[5];
        String str=null;
        try
        {
           j=8/i;                        // gives run time error{ ARITHMETIC exception} if i==0;
           System.out.println(str.length());  //  {NullPointerException}
           System.out.println(num[1]);
           System.out.println(num[5]);  // gives run time error {ArrayIndexOutOfBoundsException}
        }

        catch(ArithmeticException e)
        {
           System.out.println("Cannot divide BY zero" + e);
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
