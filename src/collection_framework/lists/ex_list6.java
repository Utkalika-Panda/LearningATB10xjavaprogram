package collection_framework.lists;
import java.util.List;
import  java.util.ArrayList;
import java.util.Collections;
public class ex_list6 {
    public static void main(String[] args) {
        List mark = new ArrayList<>();
        mark.add(90);
        mark.add(70);
        mark.add(100);
        mark.add(50);
        mark.add(80);
        System.out.println(mark);
        Collections.sort(mark);
        System.out.println(mark);
        Collections.reverse(mark);
        System.out.println(mark);
        Collections.sort(mark,Collections.reverseOrder());
        System.out.println(mark);
    }
}
