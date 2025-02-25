package collection_framework.lists.map;

import java.util.Map;
import java.util.HashMap;
public class ex_map1 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        m1.put("name","Utkalika");
        m1.put(null,"panda");
        m1.put(null,"panda2");
        m1.put("acarya",null);
        m1.put("acarya43",null);
        m1.hashCode();
        System.out.println(m1);
    }

}
