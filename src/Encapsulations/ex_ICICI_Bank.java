package Encapsulations;

public class ex_ICICI_Bank {
    public static void main(String[] args) {
        ICICI_Bank user_name = new ICICI_Bank("Utkalika",100);
        System.out.println(user_name.Name);
        System.out.println(user_name.getBalance());
        user_name.setBalance(30000,false );
        long updated_balance = user_name.getBalance();
        System.out.println(updated_balance);
    }
}
