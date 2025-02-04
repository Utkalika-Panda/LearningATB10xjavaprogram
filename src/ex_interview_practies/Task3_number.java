package ex_interview_practies;

import java.util.Scanner;

public class Task3_number {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your First number");
        int num1 = sc.nextInt();
        System.out.println("Enter your second Number");
        int num2 = sc.nextInt();
        if (num1>num2){
            System.out.println("greater number");
        } else if (num1<num2) {
            System.out.println("leeser number");

        }else {
            System.out.println("equal number");
        }
sc.close();

    }
}
