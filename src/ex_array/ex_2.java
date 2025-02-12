package ex_array;

import java.util.Arrays;

public class ex_2 {
    public static void main(String[] args){
        int[] number={23,56,387,98,98,657,1000};
        System.out.println(number.length);
        for (int i=0;i<number.length;i++){
            Arrays.sort(number);
            System.out.println(number[i]);

        }
    }
}
