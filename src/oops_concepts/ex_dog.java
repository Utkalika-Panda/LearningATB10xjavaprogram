package oops_concepts;

import java.util.Scanner;

public class ex_dog {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter dog name");
        String name_of_dog = sc.next();
        System.out.println("Enter dog eye color");
        String eye_color_of_dog = sc.next();
        System.out.println("Enter dog breed");
        String breed_of_dog = sc.next();
        Dog d1= new Dog(name_of_dog,eye_color_of_dog,breed_of_dog);
        System.out.print(d1.name + d1.color_of_eyes + d1.breed);

    }
}
