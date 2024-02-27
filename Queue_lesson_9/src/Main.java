import java.lang.reflect.Field;
import java.util.*;



public class Main {
    public static void main(String[] args) {


        Map<String,String> tm = new TreeMap<>();
        tm.put("Brazil", "Brazilia");
        tm.put("Canada", "Ottawa");
        tm.put("Denmark", "Copengagin");
        tm.put("Russia", "Moscov");
        tm.put("Sweden", "Stockholm");
        tm.put("France", "Paris");
        for (Map.Entry e:tm.entrySet()) {
            System.out.println(e.getKey() + "" + e.getValue());
        }
        Iterator iterator=tm.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry=(Map.Entry)iterator.next();
            String key=(String) entry.getKey();
            String value=(String) entry.getValue();

            System.out.println(key+"->"+value);
        }
        List keyList=new ArrayList(tm.keySet());
        List valueList=new ArrayList(tm.values());
       // Map<Field>
    }
}

