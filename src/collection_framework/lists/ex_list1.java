package collection_framework.lists;
import java.util.List;
import java.util.ArrayList;
public class ex_list1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("10");
        list.add("4");

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.indexOf(3));
        System.out.println(list);
        System.out.println("--------");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
