package collection_framework.lists;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class ex_list4 {
    public static void main(String[] args) {
      List list = new ArrayList<>();
      list.add("Mama");
        list.add("Mama1");
        list.add("Mama2");
        list.add("Mama3");
        list.add("Mam4");
        list.add("Mama5");
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
