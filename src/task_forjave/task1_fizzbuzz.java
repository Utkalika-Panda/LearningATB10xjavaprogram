package task_forjave;

public class task1_fizzbuzz {
    public static void main(String[] args) {
        for (int i=1; i<=100; i++ ) {
            if (i%3==0 && i%5==0){
                System.out.println("FIZZBUZZ");
            } else if (i%3==0) {
                System.out.println("Fizz" +i);

            } else if (i%5==0) {
                System.out.println("Buzz" +i);

            }else
                System.out.println(i);
        }


    }
}
