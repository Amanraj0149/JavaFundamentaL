package ClassInsideClass;
abstract class A{
  public abstract void show();
}
public class AnonimusClass {
    public static void main(String[] args) {
         A obj=new A()  // creating object of this anonymous class A
         {
            public void show()
            {
                System.out.println("in a show");
            }
         };
         obj.show();
    }
}
