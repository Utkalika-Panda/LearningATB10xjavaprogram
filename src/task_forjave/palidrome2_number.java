package task_forjave;

import java.util.Scanner;

public class palidrome2_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int numb = sc.nextInt();
        int rev_num = 0;
        int t=numb;
        while (numb>0) {
            int reminder = numb % 10;
            numb = numb / 10;
            rev_num = rev_num * 10 + reminder;
        }
        if (t== rev_num){
            System.out.println("number is palidrome");
        }else
            System.out.println("number is not palidrome");
    }
}
