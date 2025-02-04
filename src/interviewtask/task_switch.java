package interviewtask;

import java.util.Scanner;

public class task_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your browser");
        String browser = scanner.next();
        switch (browser){
            case "chrome" :
                System.out.println("Lunch");
            case "Firefox":
                System.out.println("firefox launch");
            case "safari":
                System.out.println("safaribrowser launch");
                break;
            default:
                System.out.println("no idea");
        }
    }


}
