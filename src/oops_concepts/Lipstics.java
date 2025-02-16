package oops_concepts;

import java.util.Scanner;

public class Lipstics {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter brand of lipstick");
        String lipstic_brand= sc.next();
        System.out.println("Enter model of lipstick");
        String lipstic_model= sc.next();
        System.out.println("Enter color of lipstick");
        String lipstic_color= sc.next();
        System.out.println("Enter price of lipstick");
        Double lipstic_price= sc.nextDouble();*/
        lipstics1 lip= new lipstics1();
        System.out.println(lip.Brand + lip.Color + lip.Model + lip.Price);

    }
}

class lipstics1{
    String Brand;
    String Model;
    String Color;
    Double Price;
    lipstics1(){
        Brand ="neviya";
        Color = "yellow";
    }
    /*lipstics1(String brand_of_lipstick, String Model_of_lipstick, String Color_of_lipstick, Double Price_of_lipstick){
        this.Brand= brand_of_lipstick;
        this.Model = Model_of_lipstick;
        this.Color = Color_of_lipstick;
        this.Price = Price_of_lipstick;*/
    }

