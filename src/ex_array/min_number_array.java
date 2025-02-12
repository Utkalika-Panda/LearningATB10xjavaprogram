package ex_array;

public class min_number_array {
    public static void main(String[] args){
       int[] number={ 14,76,564,879,9,6,78};
       int min_output=min_number(number);
        System.out.println(min_output);


    }
    static int min_number(int[] number){
        int min = number[0];

        for (int i=0;i < number.length;i++){
           if (number[i]<min) {
               min = number[i];
           }
        }
        return min;
    }
}
