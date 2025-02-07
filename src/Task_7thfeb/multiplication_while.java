package Task_7thfeb;

import java.util.Scanner;

public class multiplication_while {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();
        int i =0;
        while (i<=9){
            i++;
            System.out.printf("%d*%d=%d\n",a,i,a*i);
        }
    }
}
