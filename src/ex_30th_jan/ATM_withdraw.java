package ex_30th_jan;

import java.util.Scanner;

public class ATM_withdraw {
    public static void main(String[] args) {
        int Fixed_amount = 10000;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the withdrawal amount");
        int withdraw_amount = sc.nextInt();
        if (withdraw_amount<0){
            System.out.println("Withdraw amount should be >0");
        } else if (withdraw_amount%100!=0) {
            System.out.println("The amount should be a multiple of 100 ");
            
        } else if (withdraw_amount>Fixed_amount) {
            System.out.println("The amount should not exceed the account balance");
        }
        else {
            Fixed_amount = (Fixed_amount) - (withdraw_amount);

            System.out.println("Transaction successful\n " + " Available_balanace is\t" + Fixed_amount);
        }

    }
}
