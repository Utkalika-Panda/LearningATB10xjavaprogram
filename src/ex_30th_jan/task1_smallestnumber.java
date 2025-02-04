package ex_30th_jan;

import java.util.Scanner;

public class task1_smallestnumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1= sc.nextInt();
        System.out.println("enter 2nd number");
        int num2 = sc.nextInt();
        if (num1>num2){
            System.out.println("2nd number is smallest\t" +num2);
        }else
            System.out.println("1st Number is smallest\t" +num1);


    }
}
