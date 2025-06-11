


class Calculator {
  int num=5; // instance variable hai , outside the method,{memory store in Heap}

    // Method overloading {same method name but different Parameters}
    public int add(int n1,int n2){ 
        return n1+n2;
    }
    public int add(int n1,int n2, int n3){
        return n1+n2+n3;
    }
    public double add(double n1,double n2){
        return n1+n2;
    }
}

public class StackHeap {
    public static void main(Demo[] args){
        int num1=4;
        int num2=5;
        Calculator obj=new Calculator(); // creating objects using constructor
        Calculator obj1=new Calculator();
        int res=obj.add( num1,num2);
        obj.num=8;  
        System.out.println(obj.num); // 8  {har object ka address heap mai store hota hai, or har alag object ka memory address alag hota hai }
        System.out.println(obj1.num); // 5
    }
}

//Object Oriented Programming;

