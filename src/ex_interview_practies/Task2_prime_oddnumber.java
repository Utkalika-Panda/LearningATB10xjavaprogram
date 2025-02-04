package ex_interview_practies;

import java.util.Scanner;

public class Task2_prime_oddnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your number");
        int i = sc.nextInt();
        if (i % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("odd number");

            sc.close();
        }
    }
}
