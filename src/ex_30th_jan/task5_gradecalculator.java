package ex_30th_jan;

import java.util.Scanner;

public class task5_gradecalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your number and it should be 0 to 100");
        int grade = sc.nextInt();
        if (grade>=90 && grade<=100){
            System.out.println("You have A+ grade");
        } else if (grade>=80 && grade<=89) {
            System.out.println("You have A grade");
        } else if (grade>=70 && grade<=79) {
            System.out.println("You have B grade");
        } else if (grade>=60 && grade<=69) {
            System.out.println("You have C grade");
        } else if (grade>=50 && grade<=59) {
            System.out.println("You have D grade");
        } else if (grade>=40 && grade<=49) {
            System.out.println("You have E grade");

        }else
            System.out.println("You are fail");

    }
}
