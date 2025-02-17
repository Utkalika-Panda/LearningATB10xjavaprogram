package Encapsulations;

public class VWO_login {
    private String Name;
    private String Password;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password, boolean is_admin) {
        if (is_admin) {
            Password = password;
        }else {
            System.out.println("You are not allowed");
        }
    }

    public VWO_login(String name_c, String password_c) {
        this.Name = name_c;
       this. Password = password_c;
        //System.out.println(name_c);
        //System.out.println(password_c);
    }
}
