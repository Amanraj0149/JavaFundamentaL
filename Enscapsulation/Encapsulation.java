package Enscapsulation;

class Human
{
  private int age =11; // age :- only accessable to same class Human;
 private String name="Navin";

 // private variables access karne ke liye jo methods:-
 public int getAge()
 {
    return age;
 }

 public String getName()
 {
    return name;
 }

 public void setAge(int age)
 {
   this.age=age;   // this refer to current object
 }
 public void setName(String name)
 {
     this.name=name;
 }
}
public class Encapsulation {
     public static void main(String[] args)
     {
      Human obj=new Human();

     //   obj.age=11;        //gives error as age is private;
    //   obj.name="Navin";  //gives error as age is name;
     obj.setAge(30);
     obj.setName("navin");
       
      System.out.println(obj.getName() + " : " + obj.getAge());

     }
} 
