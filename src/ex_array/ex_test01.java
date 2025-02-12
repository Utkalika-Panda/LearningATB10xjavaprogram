package ex_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ex_test01 {
    public static void main(String[] args) {
        int[] number = {12,65,10,67,34,98};
        for (int numb: number){
            Arrays.sort(number);
            System.out.println(numb);

        }
    }


}
