package Polymorph;

// Class A banayi hai... basic class hai
class A {
    // show() method hai yahan, sabka base version
    public void show() {
        System.out.println("in A show");
    }
}

// Class B ne A ko extend kiya, aur show() method ko override kiya
class B extends A {
    public void show() {
        System.out.println("in B show");
    }
}

// Class C ne B ko extend kiya, aur show() ko aur bhi override kiya
class C extends B {
    public void show() {
        System.out.println("in C show");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // obj A type ka hai aur A ka object point kar raha hai
        A obj = new A();
        obj.show();  // Output: in A show

        // ab obj B ka object point kar raha hai
        obj = new B();
        obj.show();  // Output: in B show

        // ab obj C ka object point kar raha hai
        obj = new C();
        obj.show();  // Output: in C show
    }
}

/*
 * Polymorphism kya hota hai?
 * --------------------------
 * - Simple bhaasha mein: ek hi method ka different version run hota hai depending on object
 * - Yahan show() method teen jagah hai: A, B, aur C mein
 * - Lekin jab hum obj = new B(); ya new C(); likhte hain, toh wahi class ka show() method chalta hai
 * - Isse bolte hain **Runtime Polymorphism** yaani method overriding

 * Quick Summary:
 * --------------
 * - Reference A type ka hai, par object B ya C ka ho sakta hai
 * - Actual method jo chalega, wo object ke type pe depend karta hai, na ki reference ke type pe
 * - Isi ko kehte hain runtime polymorphism – run time pe decide hota hai kaunsa method chalega
 */
