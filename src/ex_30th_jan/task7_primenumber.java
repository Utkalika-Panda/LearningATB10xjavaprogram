package ex_30th_jan;

import java.util.Scanner;

public class task7_primenumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        if (number%2==0 && number!=0){
            System.out.println("Entered number is a prime number");
        }else
            System.out.println("Entered number is not a prime number");
    }
}
