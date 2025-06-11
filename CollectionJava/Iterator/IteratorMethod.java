package CollectionJava.Iterator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorMethod {
    public static void main(String[] args){
      Set<Integer> nums= new TreeSet<>();
      nums.add(5);
      nums.add(3);
      nums.add(4);
      nums.add(2);
      nums.add(1);

      Iterator<Integer> values= nums.iterator();

      while(values.hasNext())  // ye bas check karega aage value, hai kya 
      System.out.println(values.next());
    }
   
}
