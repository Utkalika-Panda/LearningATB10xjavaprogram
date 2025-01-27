package task_forjave;

import java.util.Locale;
import java.util.Scanner;

public class Task2_CoutnVowelsConstants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name");
        String name = sc.nextLine();
        name = name.toLowerCase();
        int vowels = 0;
        int constants =0;
        for (int i=0; i< name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'o' || ch == 'u' || ch == 'i') {
                vowels++;
            } else
                constants++;


        }
            System.out.println("number of vowels" +vowels);
            System.out.println("number of con" +constants);
        }


    }

