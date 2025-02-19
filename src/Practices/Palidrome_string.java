package Practices;

import java.util.Scanner;

public class Palidrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String name = sc.nextLine();
        name=name.toLowerCase();
        String reverse_name = "";
        for (int i=name.length()-1;i>=0;i--){
            reverse_name=reverse_name+name.charAt(i);

        }
        if (name.equals(reverse_name)){
            System.out.println("It is a palindrome");
        }else
            System.out.println("it is not a palidrome");
    }


}
