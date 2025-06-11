package StaticDemo;
 class Mobile{
    String brand;
    int price;
    String network;
    static String name; //  static: make name variable common to all objects
                        // static variable can be call with name of the class;

    public void show(){
        System.out.println(brand + " : " + price + ":" + name);
    }
    public static void show1(){
        System.out.println("static method");
        // System.out.println(brand + " : " + price); we can't use non-static variable{brand , price} in satic method,it will gives error;
        // System.out.println(name); variable{name} static hai chal jayega
    }
 }
public class StaticD {
    public static void main(String args[]){ // if we dont make main method static, then we have to create StaticD Object , as main mai method is starting of execution, if it will not work , then how could we make object 
     Mobile obj1= new Mobile();
     obj1.brand="Apple";
     obj1.price=1500;
    //  obj1.name="Smartphone"
     Mobile.name="Smartphone";  // static variable can be call with name of the class;

     Mobile obj2= new Mobile();
     obj2.brand="Samsung";
     obj2.price=1700;
     obj2.name="Smartphone";

     obj1.name="phone";  // yaha obj1 ka name change kiye , isse obj2 ka bhi ho jayega static hone ke karan

     obj1.show();
     obj2.show();
 
    //  Mobile.show(); // instace method hai show ,to bina Object create kiye error dega, class name leke method nhi chalega

 
    Mobile.show1();  // Show1 static method hai, to sirf class name {Mobile se chal jayega}
                     // object banane ki jarurat nhi;



    }
}
