package interviewtask;

import java.util.Scanner;

public class task1_tringle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter lenth of Side1");
        double side1 = sc.nextDouble();

        System.out.println("Enter lenth of Side2");
        double side2 = sc.nextDouble();

        System.out.println("Enter lenth of Side3");
        double side3 = sc.nextDouble();
if (side1 == side2 && side1 == side3 && side2 ==side3){
    System.out.println("Triangle is equal");
} else if (side1 == side2 || side2 ==side3 || side1 == side3) {
    System.out.println("Triangle is iso");
}else
    System.out.println("Triangle is scalen12.4");
    }
}
