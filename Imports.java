
// import java.util.ArrayList;
import java.util.*;
import InheritOOPS.AdvCalc;
import InheritOOPS.Calc;


public class Imports {
    public static void main(String[] args) {

      ArrayList list = new ArrayList<>();


      //  Calc obj=new Calc(); // ye error de rha tha , kyokyi calc same package mai nhi tha
        // to humlog import karvaye calc using import;
        Calc obj=new Calc();
        // similarliy , import karenge advCalc ke liye;
         AdvCalc obj1=new AdvCalc();


         //system also belong to java package; name java lang

    }
}
