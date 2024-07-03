package part3;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Collection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("!");

        for (String s : list) {
            System.out.println(s);
        }

        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("grape");

        for (String fruit : set) {
            System.out.println(fruit);
        }

        Map<String, String> map = new HashMap<>();
        map.put("apple", "りんご");
        map.put("banana", "バナナ");
        map.put("orange", "オレンジ");
        map.put("grape", "ぶどう");

        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
