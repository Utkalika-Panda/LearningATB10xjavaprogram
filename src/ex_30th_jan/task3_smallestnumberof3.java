package ex_30th_jan;

import java.util.Scanner;

public class task3_smallestnumberof3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1= sc.nextInt();
        System.out.println("Enter 2nd number");
        int num2= sc.nextInt();
        System.out.println("Enter 3rd number");
        int num3= sc.nextInt();
        if (num1<num2 && num1<num3){
            System.out.println("1st number is smallest\t" +num1);
        } else if (num2<num3) {
            System.out.println("2nd number is smallest\t" +num2);

        }else
            System.out.println("3rd number is smallest\t" +num3);
    }
}
