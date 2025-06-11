package CollectionJava.Set;

import java.util.HashSet;
import java.util.Set;

public class SetC {

    public static void main(String[] args){
    Set<Integer> nums= new HashSet<Integer>();

    nums.add(6);
    nums.add(5);
    nums.add(8);
    nums.add(2);
    nums.add(6);

    for(Integer n:nums){
        int num=(Integer)n;
        System.out.println(num);
    }

    }
}
