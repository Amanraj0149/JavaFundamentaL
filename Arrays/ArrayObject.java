package Arrays;
class Student{
    int rollno;
    String name;
    int marks;
}
public class ArrayObject {
    public static void main(String args[]){
        // creating objects
        Student s1=new Student();
        s1.rollno=1;
        s1.name="Navin";
        s1.marks=88;

        Student s2=new Student();
        s2.rollno=2;
        s2.name="harsh";
        s2.marks=66;

        Student s3=new Student();
        s3.rollno=3;
        s3.name="harish";
        s3.marks=56;

        System.out.println(s1.name + " : " + s1.marks);
        // want to create array of students
        Student students[]=new Student[3];
        // assigning objects to array;
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        for(int i=0;i<students.length;i++){
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}
