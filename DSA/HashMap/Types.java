import java.util.*;

public class typesOfMap {
    public static void main(String[] args){
        // unordered return type
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Priya");
        map.put(1, "Ajay");
        map.put(7, "Piyush");
        map.put(5, "Jeet");

        System.out.println("Hashmap class looks like:" + map);

        // order of insertion retained/preserved in LinkedHashMap
        LinkedHashMap<Integer, String> map1 = new LinkedHashMap<>();
        map1.put(3, "Priya");
        map1.put(1, "Ajay");
        map1.put(7, "Piyush");
        map1.put(5, "Jeet");

        System.out.println("LinkedHashmap class looks like:" + map1);

        // sorted output on the basis of keys
        TreeMap <Integer, String> map2 = new TreeMap<>();
        map2.put(3, "Priya");
        map2.put(1, "Ajay");
        map2.put(7, "Piyush");
        map2.put(5, "Jeet");
        map2.put(6, "Anjali");

        System.out.println("TreeMap class looks like:" + map2);
      
    }
}