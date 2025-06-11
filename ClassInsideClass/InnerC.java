package ClassInsideClass;

class A {
    public void show() {
        System.out.println("in a show - original");
    }
}

public class InnerC {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("in a show - overridden");
            }
        };
        obj.show();  // Will call the overridden method
    }
}
