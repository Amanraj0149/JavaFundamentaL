package Methods;
class Computer{  // computer class hai isme hum kya behaviour dekhna chahte hai;

    public void playmusic()
    {
        System.out.println("Music Playing....");
    }
    public String getMePen(int cost)
    {
        if(cost>=10)
        return "pen";
        else{
            return "Nothing";
        }
    }

}
public class Methods {
    public static void main(String args[])
    {
      // To access methods or behaviour of Computer class, we have to create an Object for Computer Class;
      Computer obj=new Computer();
      obj.playmusic();
      String s=obj.getMePen(2);
      System.out.println(s);
    }
}
