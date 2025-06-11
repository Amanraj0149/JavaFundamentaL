package CollectionJava.SotingInCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student 
{
    int age;
    String name;


    
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

  
    
}




public class Sorting {
    public static void main(String[] args) {

//     Comparator<Integer> com= new Comparator<Integer>()
//     {
//     public int compare(Integer i, Integer j){
//         if(i%10 > j%10) return 1;
//         else
//           return -1;
//     }
//  };
        
        // List<Integer> nums= new ArrayList<>();
        // nums.add(43);
        // nums.add(31);
        // nums.add(72);
        // nums.add(29);

        // Collections.sort(nums,com);

        // System.out.println(nums);


    Comparator<Student> com= new Comparator<Student>()
    {
    public int compare(Student i, Student j){
        if(i.age > j.age) return 1;
        else
          return -1;
    }
 };
         
        List<Student>  studs= new ArrayList<>();
       studs.add( new Student(21,"aman"));
        studs.add( new Student(12,"Thor"));
        studs.add( new Student(100,"Loki"));
        studs.add( new Student(2,"Maruti"));

        // Collections.sort(nums,com);
          
        for(Student s: studs){
         System.out.println(s);
        }
        // sort value on thier age;
          Collections.sort(studs,com);
           System.out.println(studs);

    }
}
