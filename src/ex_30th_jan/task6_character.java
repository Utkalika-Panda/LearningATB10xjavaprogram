package ex_30th_jan;

import java.util.Scanner;

public class task6_character {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a character");
        char ch1= sc.next().charAt(0);

        if (ch1>='A' && ch1<='Z'  || ch1>='a' && ch1<='z'){
            System.out.println("Entered character is a alphabet" +ch1);
        }else
            System.out.println("Entered character is not a alphabet" +ch1);
    }
}
