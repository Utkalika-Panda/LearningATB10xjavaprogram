package ex_31thjan_task;

import java.util.Scanner;

public class task1_number_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int i = number;
        int reverse_number =0;
        while (i>0){
            int digit = i%10;
            reverse_number = reverse_number*10 + digit;
            i= i/10;
            System.out.println("Reverse number: " +reverse_number);
        }
        if (number==reverse_number){
            System.out.println("This number is palindrome");
        }else
            System.out.println("This number is not palindrome");

    }
}
