package Practices;

import java.util.Scanner;

public class palidrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int reverse_number=0;
        int t =number;
        while (number>0) {
            int reminder = number % 10;
            number = number / 10;
            reverse_number = reverse_number * 10 + reminder;
        }
        if (t==reverse_number){
            System.out.println("palidrome number");
        }else
            System.out.println("not a palidrome");
    }
}
