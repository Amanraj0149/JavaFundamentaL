package CollectionJava.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collect {
    public static void main(String[] args){
    //    Collection<Integer> nums= new ArrayList<Integer>();

    List<Integer> nums= new ArrayList<Integer>();
       nums.add(6);
       nums.add(5);
       nums.add(8);
       nums.add(2);

    System.out.println(nums.indexOf(5));
     System.out.println(nums.get(2));
          
       for(int n:nums){
        int num= (Integer)n;
       System.out.println(n*2);
       }
    }
}


//collection belongs to :- java.util package;
//Collection is Interface;
