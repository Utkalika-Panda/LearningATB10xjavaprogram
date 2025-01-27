package task_forjave;

import java.util.Scanner;

public class task3_palidrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String name= sc.nextLine();
        name=name.toLowerCase();
        String reverse = "";
        for(int i= name.length()-1; i>=0; i--) {
            reverse = reverse + name.charAt(i);
        }
            if (name.equals(reverse))
                System.out.println(" Entered sting is a palindrome");
            else
                System.out.println("Entered string is not a palindome");
        }



}
