package TryWithResources;

public class TryC {
    public static void main(String a[]){

        // try can be use with finnaly keyword , we do not need catch
        // then what the use finally here?
        int j=0;
        int i=0;

       try{
            j=18/i; // The moment we got excep.. here it call catch block;
            System.out.println("bye");   // this will not print;
          }

        catch(Exception e)
        {
            System.out.println("Something went wrong");
            System.out.println("bye"); 
        } 
       finally{   // irrespective of Exception.. ye to chalega hi chalega.
            System.out.println("bye finaL");
       }



    }
}



/*
 * ==========================
 *   Java `finally` Block
 * ==========================
 *
 * ► Purpose:
 *   - Used for cleanup code (closing files, releasing resources, etc.)
 *
 * ► Execution Guarantee:
 *   - Always executes after try or catch blocks,
 *     regardless of whether an exception occurred.
 *
 * ► Placement:
 *   - Must appear after a try or try-catch block.
 *
 * ► Optionality:
 *   - `finally` is optional, but if used, must follow try/catch.
 *
 * ► Runs Even If:
 *   - Exception is thrown and caught
 *   - Exception is thrown but not caught
 *   - No exception is thrown
 *
 * ► Does NOT Run If:
 *   - JVM exits using System.exit()
 *   - JVM crashes or shuts down abruptly
 *   - Infinite loop or deadlock before reaching finally
 *
 * ► Common Uses:
 *   - Closing files, network sockets, or DB connections
 *   - Logging or cleanup operations
 *
 * ► Behavior with return:
 *   - Even if try or catch has a return statement,
 *     finally block executes BEFORE the method returns.
 *
 * ► Pro Tip:
 *   - In Java 7+, prefer try-with-resources for auto resource management.
 *
 * ► Example:
 *
 *   try {
 *       System.out.println("Inside try");
 *       int result = 10 / 0;
 *   } catch (ArithmeticException e) {
 *       System.out.println("Caught: " + e.getMessage());
 *   } finally {
 *       System.out.println("Finally always runs.");
 *   }
 *
 */


