package ex_31thjan_task;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you unit & it should be +ve value");
        int unit = sc.nextInt();
        double total_bill = 0;
        if (unit >= 1 && unit <= 100) {
            total_bill = unit * 0.50;
           // System.out.println("Your total bill is \t" + total_bill);
        } else if (unit >= 101 && unit <= 200) {
            total_bill = unit * 0.75;
            //System.out.println("Your total bill is \t " + total_bill);
        } else if (unit >= 201 && unit <= 300) {
            total_bill = unit * 1.20;
            //System.out.printf("Your total bill is \t" + total_bill);
        } else {
            total_bill = unit * 1.50;
        }

        System.out.println("Your total bill is \t" +total_bill);


    }
}
