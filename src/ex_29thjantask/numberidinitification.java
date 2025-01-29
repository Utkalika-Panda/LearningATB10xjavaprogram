package ex_29thjantask;



import java.util.Scanner;

public class numberidinitification {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter your number");
        int number = sc.nextInt();
        if (number>0){
            System.out.println("Positive Number");
        }else
            System.out.printf("Negative number");

    }
}
