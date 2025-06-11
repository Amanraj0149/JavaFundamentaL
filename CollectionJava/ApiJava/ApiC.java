package CollectionJava.ApiJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ApiC {
    public static void main(String[] args) {
    List<Integer> nums= Arrays.asList(4,5,7,2,2,6);

    // for(int i=0;i<nums.size();i++){
    //     System.out.println(nums.get(i));
    // }

    // for(int n:nums){
    //     System.out.println(n);
    // }

    // Stream<Integer> s1= nums.stream();
    // Stream<Integer> s2= s1.filter(n -> n%2==0);
    // Stream<Integer> s3= s2.map(n -> n*2);



//    s3.forEach(n-> System.out.println(n));
//    int result= s3.reduce(0,(c,e) -> c+e);

 Predicate<Integer> p =new Predicate<Integer>() {
    public boolean test(Integer n){
        if(n%2==0){
            return true;
        }
        else 
        return true;
    }
 };

 int result=  nums.stream()
                    .filter(p)
                //   .filter(n-> n%2==0)
                  .map(n-> n*2)
                  .reduce(0, (c,e) -> c+e);
   System.out.println(result);

 //   s2.forEach(n-> System.out.println(n));
    
 //   s1.forEach(n-> System.out.println(n));  // ye print hoga, stream, ke wajah se 
//    s1.forEach(n-> System.out.println(n));  // ye print nhi hoga,  error dega;

    // nums.forEach(n-> System.out.println(n));  ye for each loop;

    int sum=0;
    for(int n:nums)
    {
        // want to add even number only;
        if(n%2==0){
            n=n*2;
            sum=sum+n;
        }
    }
    System.out.println(sum);

    }
}
