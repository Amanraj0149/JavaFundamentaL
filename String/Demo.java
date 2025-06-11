public class Demo {
    public static void main(String[] args) {
        String name= new String("navin"); // string object
        //  System.out.print(name);
         System.out.println("hello " + name);
         System.out.println(name.charAt(1));
         System.out.println(name.concat("reddy"));

         String s1="Navin"; // here only 1 object created in heapfors1 and s2;
         String s2="Navin";// in string constant pool

        System.out.println(s1==s2);  // true

        // upar s1 & s2 ek hi adress ko point karenge heap memo mai;
        // s1 phele navin naam ka adress save karega ;
        // s2 check karega ki navin naam ka adress kahi store to nhi hai heap mai;
        // store tha navin , to stack list mai do no ek hi adress ko point karenge;

        //Example:- 
           // [s1]:[103]
           // [s2]:[103] 
    }
}
// stack memory mai (name) variable ayega, lekin uska adress heap mai hoga
// as humne string object jo banaya hai
