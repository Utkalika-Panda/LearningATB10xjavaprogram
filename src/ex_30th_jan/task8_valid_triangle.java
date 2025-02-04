package ex_30th_jan;

import java.util.Scanner;

public class task8_valid_triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the side1");
        float side1 = sc.nextFloat();
        System.out.println("Enter the side1");
        float side2 = sc.nextFloat();
        System.out.println("Enter the side1");
        float side3 = sc.nextFloat();
        if ((side1 + side2 >side3) && (side1+side3>side2) && (side3+side2>side1) ){
            System.out.println("Triangle is valid triangle");
        }else
            System.out.println("Triangle is not a valid triangle");
    }
}
