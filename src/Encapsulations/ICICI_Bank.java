package Encapsulations;

public class ICICI_Bank {
    String Name;
   private long Balance;

    public long getBalance() {
        return Balance;
    }

    public void setBalance(long balance, boolean is_cashier) {
        if (is_cashier) {
            Balance = balance;
        }else {
            System.out.println("You are not eligible to update the balance");
        }
    }

    public ICICI_Bank(String name, long balance) {
       this.Name  = name;
        this.Balance = balance;
    }
}
