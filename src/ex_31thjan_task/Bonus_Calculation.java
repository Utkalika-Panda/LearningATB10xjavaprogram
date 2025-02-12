package ex_31thjan_task;

import java.util.Scanner;

public class Bonus_Calculation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your salary");
        float salary = sc.nextFloat();
        System.out.println("Enter the year and should be +ve number");
        int year = sc.nextInt();
        double Bonus = 0;
        if (year<1){
            System.out.println("No bonus");
        } else if (year>=1 && year<=3) {
            System.out.println("Bonus is 5% of the salary");
            Bonus = salary*0.05;
        } else if (year>=4 && year <=6) {
            System.out.println("Bonus is 10% of the salary");
            Bonus = salary*0.10;
        } else if (year>6) {
            System.out.println("Bonus is 15% of the salary");
            Bonus = salary*0.15;
        }
        System.out.println("Bonus of the person according to salary and year\t" +Bonus);
    }
}
