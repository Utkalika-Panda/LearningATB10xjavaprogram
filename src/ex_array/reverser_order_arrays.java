package ex_array;

import java.util.Arrays;

public class reverser_order_arrays {
    public static void main(String[] args){
        int[] number={7,3,89,34,98,45};
        for (int i=number.length-1;i>=0;i--){
            //Arrays.sort(number);
            System.out.println(number[i]);
        }
    }
}
