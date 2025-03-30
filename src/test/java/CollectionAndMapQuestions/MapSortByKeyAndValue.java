package CollectionAndMapQuestions;

import java.util.*;

public class MapSortByKeyAndValue {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");
        MapSortedByKey(map);
        MapSortedByValue(map);
    }

    private static Map<Integer,String> MapSortedByKey(HashMap<Integer,String> map) {
        // Sort by key using TreeMap
        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

        // Print sorted map
        System.out.println("Sorted by Key: " + sortedMap);
        return sortedMap;
    }
    private static Map<Integer,String> MapSortedByValue(HashMap<Integer,String> map){

        // Convert entry set to a list
        List<Map.Entry<Integer,String>> list = new ArrayList<>(map.entrySet());
        // Sort list by values
        list.sort(Map.Entry.comparingByValue());
        // LinkedHashMap to maintain order
        LinkedHashMap<Integer,String> sortedMap = new LinkedHashMap<>();
        for(Map.Entry<Integer,String>entry :list){
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        System.out.println("Sorted by value: " +sortedMap);
        return sortedMap;
    }
}
