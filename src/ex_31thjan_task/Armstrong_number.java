package ex_31thjan_task;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int temp=number;
        int sum=0;

        while (number>0){
        int r = number%10;
        number =number/10;
        sum =sum + r*r*r;
        }
        if (temp==sum){
            System.out.println("Number is a palidrome");
        }else
        System.out.println("Number is not a palidrome");
    }
}
