package ex_array;

public class sum_of_array {
    public static void main(String[] args) {
        int[] number={23,34,76};
        int sum =0;
       // for (int i=0;i<number.length;i++) {
            //sum = sum + number[i];
        //}

        for (int n: number){
            sum=sum+n;
        }
        System.out.println(sum);
    }
}
