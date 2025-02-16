package oops_concepts;

import java.util.Scanner;

public class ex_constoctor2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter tesla model name");
        String Model_car = sc.next();
        System.out.println("Enter year of creation");
        int of_creation = sc.nextInt();
        Car2 tesla= new Car2(Model_car, of_creation);
        System.out.println(tesla.Model);
        System.out.println(tesla.year);

        System.out.println("Enter  model name of nano");

        String Model2_car = sc.next();
        System.out.println("Enter  model name of nano");
        int of2_creation = sc.nextInt();

       Car2 nano = new Car2(Model2_car,of2_creation);
        System.out.println(nano.Model);
        System.out.println(nano.year);
    }
}
