package ex_29thjantask;

import java.util.Scanner;

public class even_odd_number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Number");
        int number = sc.nextInt();
        if (number%2==0){
            System.out.println("Even Number");
        }else
            System.out.println("Odd Number");
    }
}
