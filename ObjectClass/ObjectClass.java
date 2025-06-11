package ObjectClass;

class Laptop
{
 String models;
 int prices;
public String toString()
{
return models + ":" + prices;
}

public boolean equals(Laptop that){
  if(this.models.equals(that.models) && this.prices ==that.prices){
    return true;
  }
  return false;
}

}
public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj= new Laptop();
        obj.models="Lenovo Yoga";
        obj.prices=1000;

        Laptop obj1= new Laptop();
        obj1.models="Lenovo Yoga";
        obj1.prices=1000;



        // System.out.println(obj.toString());  // Everytime we print obj it will call toString method;

        //here obj1 & obj2 have values are same but they are not equal; gies false;
       boolean res= obj.equals(obj1);

       // baad mai hum khud ka equal method banaye laptop class mai to wo diya :-TRure;
       System.out.println(res);

    }
}
