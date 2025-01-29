package ex_29thjantask;

import java.util.Scanner;

public class vowel_consonant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter character");
        char input= sc.next().charAt(0);
        if (input=='a' || input=='e' || input=='o'||input=='u'||input=='i'){
            System.out.println("Character is vowel\t" +input);
        }else
            System.out.println("Character is consonant\t" +input);


    }
}
