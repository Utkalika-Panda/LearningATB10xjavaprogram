package ex_array;

public class number_sorting {
    public static void main(String[] args) {
        int[] a ={34,56,26,87,567,98};
        for (int i=0;i<=a.length;i++){

            for (int j=i;j<=a.length;j++){
                int swap=0;
                if (a[i]>a[j]){
                    swap=a[i];
                    a[i]= a[j];
                    a[j]=swap;

                }
            }
        }


    }
}
