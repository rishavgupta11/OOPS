package CollectionFramework;

import java.util.*;
import java.util.Collection;

public class LearnMaps {
    public static void main(String[] args) {

//        List<Integer> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        map.put("us", "United States");
        map.put("in", "India");
        map.put("en", "England");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (Map.Entry<String, String> entry: entries) {
            System.out.println(entry.getKey() +", "+entry.getValue());
        }

//        ArrayList<String> keys = new ArrayList<> (map.keySet());
//
//        Collection<String> values = map.values();
//
//        System.out.println(values);

//        map.remove("us");
//
//        System.out.println(map.containsKey("pn"));
//
//        System.out.println(map);
//
//        System.out.println(map.get("en"));
//        System.out.println(map.getOrDefault("en", "Others"));


    }
}
