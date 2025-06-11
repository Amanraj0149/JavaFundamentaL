public class DemoBuffer {
 public static void main(String args[]) {
    String name="navin";
    name = name + " reddy"; 
// now this will points to new address in heap 
// now that name variable adress, its completly new;
// jo phele wala name ka adress tha heap mai wo garbage collection mai jayenga

   //STRING in java is immutable , any change make it pointing diffrent adress;
    StringBuffer sb= new StringBuffer("navin");
    System.out.println(sb.capacity());
    sb.append(" Reddy");
    System.out.println(sb);
   sb.insert(6,"java ");
   sb.setLength(30);
   System.out.println(sb);


 }  
}
