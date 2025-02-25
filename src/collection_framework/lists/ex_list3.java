package collection_framework.lists;
import java.util.List;
import java.util.ArrayList;
public class ex_list3 {
    public static void main(String[] args) {
        List my_list = new ArrayList();
        my_list.add("Utkalika");
        my_list.add("Panda");
        my_list.add("123");
        my_list.add("true");
        my_list.add("Naman");
        my_list.add("Acharya");
         //for(int i=0; i<my_list.size();i++){
            // System.out.println(my_list.get(i));
             //System.out.println(my_list.getFirst());
            // System.out.println(my_list.getLast());
            //System.out.println(my_list.getClass());
        for(Object A:my_list){
            System.out.println(my_list);
        }
         }

    }

