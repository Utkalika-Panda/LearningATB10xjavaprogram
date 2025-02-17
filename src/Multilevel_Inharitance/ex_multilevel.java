package Multilevel_Inharitance;

public class ex_multilevel {
    public static void main(String[] args) {
        Son S1 = new Son();
        S1.Money();
        S1.Father_home();

        Grand_Father GF1= new Grand_Father();
        GF1.home();
        Father F1 = new Son();
        F1.Money();
    }
}
