package poly;

public class ex_method_overloading {
    public static void main(String[] args) {
        method_overloding M1 = new method_overloding();
        int R =M1.addition(5,9); //Methods overloading should be in same class and method , function name should be sam e
        int R1=M1.addition(7,4,2);
        System.out.println(R +" "+R1);

    }
}
