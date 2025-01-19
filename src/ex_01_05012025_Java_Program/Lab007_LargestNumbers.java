package ex_01_05012025_Java_Program;

public class Lab007_LargestNumbers {
    public static void main(String[] args) {
        int a=45 , b=56, c=32;
        String results = (a>b && a>c? "a is largest number": (b>c?"b is largest number":"c is largest number"));
        System.out.println(results);

    }

}
