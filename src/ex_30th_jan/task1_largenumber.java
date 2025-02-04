package ex_30th_jan;

import java.util.Scanner;

public class task1_largenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of number1");
        int num1 = sc.nextInt();
        System.out.println("Enter the value of number2");
        int num2 = sc.nextInt();
        System.out.println("Enter the value of number3");
        int num3 = sc.nextInt();
        if (num1 > num2 && num1 > num3  ) {
            System.out.println("1st is largest" + num1);
        } else if (num2 > num3) {
            System.out.println("2nd number is largest" + num2);

        } else {
            System.out.println("3rd number is largest\t" + num3);

        }
    }
}
