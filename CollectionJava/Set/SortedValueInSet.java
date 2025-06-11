package CollectionJava.Set;

import java.util.Set;
import java.util.TreeSet;

public class SortedValueInSet {
    public static void main(String[] args) {
        Set<Integer> nums= new TreeSet<Integer>(); // ye hashset ke jagah use kiye , isse sorting Ho jata hai;
        nums.add(5);
        nums.add(2);
        nums.add(4);
        nums.add(1);
        nums.add(3);
        nums.add(1);

        for(Integer n: nums){
            System.out.println(n);
        }
     // output sorted hoga;
        
    }
}
