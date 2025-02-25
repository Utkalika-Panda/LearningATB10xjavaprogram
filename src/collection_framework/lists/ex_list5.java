package collection_framework.lists;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ex_list5 {
    public static void main(String[] args) {
        List <String>STD_name = new ArrayList<>();
        STD_name.add("Utkalika");
        STD_name.add("Manas");
        STD_name.add("naman");
        STD_name.add("mamani");

        List<Integer> mobile_number= new ArrayList<>();
        mobile_number.add(345453543);
        mobile_number.add(345458543);
        mobile_number.add(345454043);
        mobile_number.add(345454343);

        List student_details= new ArrayList<>();
        student_details.add(STD_name);
        student_details.add(mobile_number);
        System.out.println(student_details);
        System.out.println(student_details.get(0));

    }
}
