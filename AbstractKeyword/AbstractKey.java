abstract class car {
    public abstract void drive();
    public abstract void fly();
    public void PlayMusic() {
        System.out.println("plymusic.....");
    }
}

abstract class BMW extends car {
    public void drive() {
        System.out.println("Driving.....");
    }
}

class Bmwplus extends BMW {
    public void fly() {
        System.out.println("car is flying");
    }
}

public class AbstractKey {
    public static void main(String[] args) {
 //     car obj = new car();  🚫can't create object for abstract class;
 //     car obj = new BMW();  🚫
        car obj = new Bmwplus();
        obj.drive();
        obj.PlayMusic();
        obj.fly();
    }
}


// Summary:
// 1. Abstract classes can have both abstract and concrete methods.
// 2. Abstract methods must be implemented by the first non-abstract subclass.
// 3. We cannot create an object of an abstract class directly.
// 4. Subclasses must implement all abstract methods, unless they are also declared abstract.
// 5. In this example, `car` is the base abstract class, `BMW` is a partial implementation, and `Bmwplus` is a complete implementation.
// 6. The main method creates an object of `Bmwplus` and uses polymorphism to call methods from the abstract hierarchy.

