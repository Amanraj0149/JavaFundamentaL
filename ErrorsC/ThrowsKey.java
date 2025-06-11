package ErrorsC;

class A {
    public void show() {
        try {
            Class.forName("ErrorsC.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Not able to find the class... " + e);
        }
    }
}

public class ThrowsKey {
    static {
        System.out.println("Class Loader");
    }

    public static void main(String[] args) {
        A obj = new A();  // corrected variable name
        obj.show();       // corrected method call
    }
}

// o/p:- Class Loader
//       Not able to find the class... java.lang.ClassNotFoundException: ErrorsC.NonExistentClass



// Program mein ek class hai A, jismein ek method show() hai jo try karta hai ek class ko runtime par load karne ke liye.

// Lekin jo class load karne ki koshish ki gayi hai (NonExistentClass), wo exist nahi karti, isliye Java ek ClassNotFoundException throw karta hai.

// Is exception ko catch block handle karta hai aur ek message print karta hai ki class nahi mil paayi.

// ThrowsKey class mein ek static block hai jo sabse pehle run hota hai aur print karta hai "Class Loader" — ye tab hota hai jab class pehli baar memory mein load hoti hai.

// main() method ek object banata hai class A ka aur uska show() method call karta hai.

// Aakhir mein output aata hai jismein pehle "Class Loader" aur phir exception ka message print hota hai.