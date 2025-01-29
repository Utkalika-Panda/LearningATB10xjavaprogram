package ex_29thjantask;

import java.util.Scanner;

public class maxmin_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        if (num1>num2){
            System.out.println("num1 is greater that num2\t"  +num1);
        }else
            System.out.println("num2 is greater than num2\t" +num2);
    }
}
