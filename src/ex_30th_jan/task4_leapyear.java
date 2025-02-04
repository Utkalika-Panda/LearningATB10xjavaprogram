package ex_30th_jan;

import java.util.Scanner;

public class task4_leapyear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();
            if (year%4==0 && year%100!=0 || year%400==0){
                System.out.println("Entered year is a leap year\t" + year);
            }
            else
                System.out.println("Enter year is not a leap year\t" +year);
    }
}
