package ex_31thjan_task;

import java.util.Scanner;

public class task2_loan_eligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you Age ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Age should be positive integer");
        } else if (age >= 18 && age <= 80) {
            System.out.println("Age validation is success");

        } else {
            System.out.println("Age lime min 18 & max 80");
            System.exit(0);
        }

        System.out.println("Enter your salary");
        float salary = sc.nextFloat();
        if (salary<0){
            System.out.println("Salary should be +ve number ");
        } else if (salary>=30000) {
            System.out.println("Salary validation is success");
        
        }else
            System.out.println("Min salary should be 30000");
            System.exit(0);
        System.out.println("enter your Credit score");
        int credit_score = sc.nextInt();
            if (credit_score<0){
                System.out.println("Credit score should be +ve number");
             } else if (credit_score>=650 && credit_score<=850) {
            System.out.println("Credit code validation successful & you are eligible for loan");
            
            }else
                System.out.println("Credit score should be minimum 650 & max 850");


    }
}
