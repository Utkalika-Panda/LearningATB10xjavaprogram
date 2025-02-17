package Encapsulations;

public class ex_Encap {
    public static void main(String[] args) {
        VWO_login user = new VWO_login("Utkalika", "453");
        user.setName("Naman");
        System.out.println(user.getName());
        boolean is_admin = true;
        user.setPassword("6567",false);
        System.out.println(user.getPassword());


    }
}
