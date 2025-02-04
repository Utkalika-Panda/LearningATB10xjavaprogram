package interviewtask;

import java.util.Scanner;

public class task_table_of_2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter you number");
        int a = scanner.nextInt();

        for (int i=1;i<=10;i++){
            System.out.printf("a*%d=%d\n", i,a*i);
        }
    }
}
