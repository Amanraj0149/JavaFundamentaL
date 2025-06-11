package Input;

import java.util.Scanner;

public class Inputc {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        // int num=System.in.read(); ye ascii value store karega, jo input lenge uska;
        System.out.println(num);
    }
}
