package Fn;
@FunctionalInterface // iska matalb hai ki interface class mai ek hi method rhega
interface A {
    void show(int i);
}

public class FuncInter {
    public static void main(String[] args) {
        A obj = new A() { 
            // upar class B extend karte , use achha innerClass bana diye;
            public void show(int i) {
                System.out.println("in show" + i);
            }
        };
              
 
        // Ekdum same hai ,upar ki tarah:- Lambda Function use hua -> ye arrow
        // khud bolega, void show method dhundo or chalao;

        // A obj = (i) ->
        //     {    
        //      System.out.println("in show");  
        //     };


        obj.show(5);
//      Lambda expression only work with functionalInterface;
    }
}
