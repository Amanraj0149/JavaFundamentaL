package FinalKeyword;

// ======= FINAL CLASS =======
// Agar kisi class ko final bana diya, toh us class ko koi aur extend nahi kar sakta (i.e. no inheritance allowed)
final class Calc {
    public void show() {
        System.out.println("By calculator");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

// ❌ Niche wali class error degi agar uncomment kiya toh, kyunki Calc class final hai
// class AdvCalc extends Calc { }  // ❌ Not allowed – final class can't be extended


// ======= FINAL METHOD =======
// Agar kisi method ko final bana diya, toh us method ko koi child class override nahi kar sakti
class Calcu {
    public final void show() {  // ✅ Final method – isse override nahi kar sakte
        System.out.println("By calculator");
    }

    public void add(int a, int b) {
        System.out.println(a + b);
    }
}

// Ab yahan try karenge override karne ka, par error aayega agar uncomment kiya
class AdvCalcu extends Calcu {
    // ❌ This will give error because show() is final in parent class
    // public void show() {
    //     System.out.println("By A-man");
    // }
}


public class finalK {
    public static void main(String[] args) {

        // ======= FINAL VARIABLE =======
        final int num = 8;  // Final variable – ek baar value di, fir change nahi kar sakte
        // num = 9;  // ❌ Error – can't change value of final variable

        // Object bana rahe AdvCalcu ka
        AdvCalcu obj = new AdvCalcu();
        obj.show();        // Output: By calculator (inherited from parent, not overridden)
        obj.add(4, 5);     // Output: 9
    }
}


/*
================ SUMMARY =================

1. final variable:
   - Jab kisi variable ko `final` banate hain, uski value ek baar set hone ke baad change nahi ho sakti.
   - Example: final int x = 10;

2. final class:
   - Agar koi class `final` hai, toh usse koi aur class extend nahi kar sakti.
   - Matlab: inheritance band kar diya us class ke liye.
   - Example: final class A { }

3. final method:
   - Agar koi method `final` hai, toh us method ko override nahi kiya ja sakta child class mein.
   - Use when you want to stop method overriding.

===========================================
Final keyword ka use hota hai kisi cheez ko "fix" karne ke liye –
   final variable = constant
   final method = no overriding
   final class  = no inheritance
===========================================
*/
