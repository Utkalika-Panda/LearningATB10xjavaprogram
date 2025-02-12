package ex_array;

public class max_number_fromarrays {
    public static void main(String[] args){
      int[] number = {12,76,34,89,9,678,7665,34};
      int max_output = max_number(number);
        System.out.println(max_output);

    }

    static int max_number (int[] number){
        int max= number[0];
        for (int i=0;i<number.length;i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        return max;
    }
}
