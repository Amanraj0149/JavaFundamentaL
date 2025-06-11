enum Status{
    Running, Failed, Pending, Sucess;
}
public class Ifelse {
    public static void main(String[] args) {
        Status s= Status.Pending;
       System.out.println(s.getClass().getSuperclass());
        switch(s)
        {
            case Running:
            System.out.println("All good");
            case Failed:
            System.out.println("Try again");
            case Pending:
            System.out.println("please wait");
            default:
            System.out.println("done");
        }

        if(s==Status.Running)
         System.out.println("All Good");
    else if(s== Status.Failed)
         System.out.println("Try again");
      else if(s== Status.Pending){
         System.out.println("please wait");
      }
      else
         System.out.println("Done");
         
    }
}


//WE CANNOT EXTENDS eNUM WITH OTHER CLASS;