package collectionQueueAndSet;

import java.util.HashMap;
import java.util.Map;

public class LearnMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("us", "United States");
        map.put("in", "India");
        map.put("in", "India");
        map.put("in", "India2"); // key in value will replace from India2
        map.putIfAbsent("us", "United States");

        System.out.println(map); // print map with key value

        map.remove("us"); // will remove the key from map
        System.out.println(map); // will print map only in india2

        System.out.println(map.containsKey("in")); // will print if key exist
        System.out.println(map.get("in"));
        System.out.println(map.getOrDefault("en", "Others"));
    }
}
