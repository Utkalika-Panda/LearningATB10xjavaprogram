package Interview_question;

import java.util.Arrays;

public class interview_solution {
    public static void main(String[] args) {
        String input = "vision without action is day dream";
        String[] input_array = input.split(" ");
        String Small= input_array[0];
        String Large = input_array[0];
        for(int i =1; i<input_array.length; i++){
            if (input_array[i].length()< Small.length()){
                Small= input_array[i];
            } else if (input_array[i].length()>Large.length()) {
                Large = input_array[i];
            }

        }
        System.out.println("Small string is =" + Small + " " + "Large string is=" + Large);

    }


}
