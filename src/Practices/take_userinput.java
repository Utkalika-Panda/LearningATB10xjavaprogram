package Practices;

import java.util.Scanner;

public class take_userinput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your value");
        //int a = sc.nextInt();
        String name= sc.next();
        System.out.println(name);
    }
}
