enum Status   // ye class hai
{
    Running, Failed,Pending, Sucess;  // ye sab bi-default Object hai;
}


public class Enum {
   public static void main(String[] args) {
    int i=5;
     Status s= Status.Sucess;
     System.out.println(s.ordinal());
// if we want to print all Status Object;
    Status[] e= Status.values();

    for( Status j:e){
        System.out.println(j + ": " + j.ordinal());
    }
   } 
}
