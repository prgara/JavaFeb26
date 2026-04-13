package apr11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Ronak", 98);
        marks.put("Pradeep", 97);
        marks.put("Ishan", 100);
        marks.put("Dipan", 99);
        marks.put("Dipan", 100);

        marks.putIfAbsent("Kumar", 110);
        System.out.println(marks);
        Set<String> strings = marks.keySet();
        System.out.println(strings);
        Collection<Integer> values = marks.values();
        System.out.println(values);

        Set<Map.Entry<String, Integer>> entries = marks.entrySet();
        for (var entry : marks.entrySet()){
//            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        Set<String> keys = marks.keySet();
        for(String key:keys){
            System.out.println(marks.get(key) + ":" + key);
        }





//        System.out.println(marks.getOrDefault("Dipan",120));
//        System.out.println(marks.containsKey("Dipan"));
//        System.out.println(marks.containsKey("Kumar"));
    }
}
