package Practices;

import java.util.Scanner;

public class Grade_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your score which should be in between 1 to 100");
        int score = sc.nextInt();
        char grade;
        if (score>=90 && score<=100){
            grade ='A';
        } else if (score>=80 && score<90) {
            grade='B';
        } else if (score>=70 && score<60) {
            grade='c';
        }else if (score>=50 && score<40) {
            grade = 'd';
        }else
            grade='F';
        System.out.println(grade);
    }
}
