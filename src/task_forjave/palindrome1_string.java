package task_forjave;

import java.util.Scanner;

public class palindrome1_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String Name = sc.nextLine();
        Name= Name.toLowerCase();
        String Reverse_string ="";
        for (int i=Name.length()-1;i>=0;i--) {
            Reverse_string = Reverse_string + Name.charAt(i);
            System.out.println(Reverse_string);

        }
        //if (Name.equals(Reverse_string)){
        //    System.out.println("It is a palidrome");
       // }else
         //   System.out.println("Not a palidrome");

    }
}
