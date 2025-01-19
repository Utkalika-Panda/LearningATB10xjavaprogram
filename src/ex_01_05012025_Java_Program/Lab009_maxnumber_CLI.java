package ex_01_05012025_Java_Program;

public class Lab009_maxnumber_CLI {
    public static void main(String[] args) {
        String num1 = args[0];
        int a = Integer.parseInt(num1);
        String num2 = args[1];
        int b = Integer.parseInt(num2);
        int c = (a>b? a : b); //args 67,45 value
        System.out.printf("Greatest Number is " + c);
    }

}
