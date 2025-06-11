enum Laptop{
    Macbook(2000) , XPS(2200), surface, Thinkpad(1800);

    private int prices;

    
    //constructor;  right click karke, souce code se constructor bulaye
    // uppar jab macbook,xps sab ka price dale daba mai to error diye , isliye constructor banaye
    
    private Laptop(int prices) {
        this.prices = prices;
        System.out.println("in Laptop"+ this.name());
    }

    
 // default constructor banaye, kyuki surface ka price nhi rakhe hai;
    private Laptop() {
        prices=500;
    }

// yaha constructor 4 baar call hua hoga; 
 // default wala : 1 baar;
 // parametrise wala:3 baar;


    public int getPrice(){
          return prices;
    }
    public void setPrice(int prices){
        this.prices=prices;
    }
}


public class TreatingAsClass {
  public static void main(String[] args) {
    // Laptop lap=Laptop.Macbook;
    // System.out.println(lap+ ": " + lap.getPrice());
    for(Laptop lap: Laptop.values())
    {
        System.out.println(lap+ ": " + lap.getPrice());
    }
  }  
}
