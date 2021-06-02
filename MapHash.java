import java.util.*;

public class MapHash {
    public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Raju");
        map.put(2, "Sam");
        map.put(3, "Samson");

        map.remove(3);

        System.out.println("Map: "+map);
        System.out.println("Map entries: "+map.entrySet());
        System.out.println("Map values: "+map.values());
        System.out.println("Map size: "+map.size());
        System.out.println("Map update at 3: "+map.put(3, "Johnson"));
        System.out.println("Map at index 1: "+map.get(1));
        System.out.println("Map all keys: "+map.keySet());
        System.out.println("Contains any key at index 1: "+map.containsKey(1));

        map.clear();
        System.out.println("Map after clear: "+map);
    }
}
