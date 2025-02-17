package poly;

public class ex_over_ride {
    public static void main(String[] args) {
        TC1_run T1 = new TC1_run();
        T1.opening_browser();
        TC2_run T2 = new TC2_run();
        T2.opening_browser();
    }
}

class Common_to_alltc{
    void opening_browser(){
        System.out.println("Open the browser in 5 sec..");
    }
}
class TC1_run extends Common_to_alltc{
    void running_TC1(){
        opening_browser();
    }
}
class TC2_run extends Common_to_alltc{
    @Override
    void opening_browser(){
        System.out.println("Open the browser in 2 sec..");
    }


}
