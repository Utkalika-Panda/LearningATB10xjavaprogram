package ex_interview_practies;


import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class task4_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you score");
        int score = sc.nextInt();
        char grade ='F';
        if (score>=90 && score<=100){
            grade = 'A';
        } else if (score>=80 && score<=89) {
            grade = 'B';
            
        } else if (score>=70 && score<=79) {
            grade = 'C';
        } else if (score>=60 && score<=69) {
            grade = 'D';
        } else if (score<=0 || score>100) {
            System.out.println("You are God level");
        } else  {
            grade = 'F';
            System.out.println("You are fail" +grade);

        }

    }
}
