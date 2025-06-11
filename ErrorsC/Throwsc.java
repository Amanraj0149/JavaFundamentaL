

package ErrorsC;

public class Throwsc {

    // Yeh method bol raha hai ki yeh ClassNotFoundException throw kar sakta hai
    public void myMethod() throws ClassNotFoundException {
        // Aisi class ko load karne ki koshish kar raha hai jo exist nahi karti
        Class.forName("ErrorsC.DummyClass");
    }

    public static void main(String[] args) {
        Throwsc obj = new Throwsc();

        try {
            obj.myMethod();  // yeh method exception throw karega
        } catch (ClassNotFoundException e) {
            System.out.println("Class nahi mili: " + e);
        }
    }
}




// ✅ 1. throws kya hai?
// throws Java ka keyword hai jo batata hai ki kisi method ke andar exception ho sakta hai.

// ✅ 2. throws ka use kyun hota hai?
// Agar koi method aisa kaam kar raha ho jahan exception aa sakta hai (jaise file read karna, class load karna, etc), to throws likh kar bataya jaata hai ki ye method exception throw karega, aur use handle karna caller ka kaam hai.

// ✅ 3. throws kis ke saath likhte hain?
// throws method declaration ke baad likhte hain, jaise:

// java
// Copy code
// public void myMethod() throws IOException {
//     // risky code
// }
// ✅ 4. Kaunse exceptions ke liye throws jaruri hai?
// Sirf checked exceptions ke liye throws likhna jaruri hota hai.

// 🔸 Checked Exception = Compile time par check hota hai (e.g., IOException, SQLException, ClassNotFoundException)
// 🔸 Unchecked Exception = Runtime par aata hai (e.g., NullPointerException, ArithmeticException) → Iske liye throws zaroori nahi

// ✅ 5. throws aur throw mein kya fark hai?
// throws	throw
// Method ke signature mein aata hai	Method ke body mein likha jaata hai
// Batata hai ki method exception throw kar sakta hai	Actually exception ko throw karta hai
// e.g. void m() throws IOException	e.g. throw new IOException();

// ✅ 6. throws ke sath multiple exceptions kaise likhte hain?
// Aap comma laga ke likh sakte ho:

// java
// Copy code
// public void myMethod() throws IOException, ClassNotFoundException {
//     // code
// }
// ✅ 7. Agar throws na likho to kya hoga?
// Agar method ke andar checked exception aata hai aur aapne throws nahi likha ya try-catch nahi kiya, to compile time error aayega.

// ✅ 8. Kya constructor ke sath bhi throws use kar sakte hain?
// Haan, constructor ke sath bhi throws keyword use kiya ja sakta hai.

// java
// Copy code
// public MyClass() throws IOException {
//     // code
// }
// ✅ 9. Best Practice kya hai?
// Agar method exception handle nahi kar raha, to throws likhna chahiye.

// Agar aapko handle karna hai to try-catch use karo.

// 📌 Example Summary:
// java
// Copy code
// public void readFile() throws IOException {
//     FileReader f = new FileReader("abc.txt");
// }
// Yeh method bol raha hai: "Main file read karta hoon, agar file na mile to IOException throw karunga."
// Jo bhi readFile() call karega, usko ya to try-catch karna hoga, ya throws use karna hoga.