package Constructor;

class Human 
{
   private int age;
   private String name;

   public Human() // ye  DEFAULT constructor hai;
   { 
     age=12;
     name="john";

   }
   public Human(int a , String n){ // PARAMETRIZE constructor
    age=a;
    name=n;
   }
   public int getAge()
   {
    return age;

   }
   public String getName(){
    return name;
   }
    
}
public class Cons2 {
    public static void main(String[] args) {
        Human obj= new Human();
        Human obj1=new Human(18,"Navin");
        System.out.println(obj.getName() + " :" + obj.getAge());
        System.out.println(obj1.getName() + " :" + obj1.getAge());

    }
}
