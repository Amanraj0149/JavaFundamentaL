import Demo;

package helloJava;
class Hello{
public static void main(Demo args[]){ // jvm looks for this syntax to run the code
    System.out.println("hello world");
    int num1=3;
    int num2=5;
    int res=num1+num2;
    System.out.println(res);
    System.out.println(8+7);


 // 📍 DATA TYPES :- 1)PRIMITIVE ,    2)NON-primitive

        // byte by=129; gives error byte range is from  -128< byte> 128

        short sh=558;

        long l=5854l;

        // float f=5.8;  // by defalut 5.8 yaha pe doublr hai 
        float f=5.8f;

        double d=5.8;

        char c='a';
         char g='8';  // literals

        boolean b=true;


          
        
// 📍 literals

char v='a';
v++;
System.out.println(v); // o/p:- b , doing v++ increment the character value;

     int num3=0b101; // for binary write b before binary of 5 ->101
     int num4=0x7E; // for hexadecimal number write x;
     int num5=10_00_000; // in java we can use _ to seprate or count zeros;
     System.out.println(num3);
     System.out.println(num4);
     System.out.println(num5);


     // Assigning Integer value to Double:-
     double num6=12e10;
     System.out.println(num6);

     // In java int cannot be converted into boolean
           //  boolean num7=1;  
     // cannot convert from int to booleanJava


// 📍 T Y P E ｃａｓｔｉｎｇ ａｎｄ Ｃｏｎｖｅｒｓｉｏｎ ：－

      // byte z= 257; gives error as range of byte is from -128 to 127

byte z= 127;
int u=z;    // byte assign to int possible as byte value is small
System.out.println(u);

int j=12;
  //byte f= j; // cannot convert from int to byteJava
byte h =(byte)j;
System.out.println(h);

//📍 what if int value is >127;
int k=257;  
byte m=(byte)k;  // value bada hai lekin covert kardega by using modulo
System.out.println(m);  // o/p:= 1 as 257%256=1


float f1=5.6f;
int t=(int)f1;
System.out.println(t); // o/p:-5


 // 📍TYPE PROMOTION:-
     
 byte a1=10;
 byte b1=30;

 int res1= a1*b1;  // java mai isko promote kar dega , int mai store kar sakte hai
System.out.println(res1);



























}
}