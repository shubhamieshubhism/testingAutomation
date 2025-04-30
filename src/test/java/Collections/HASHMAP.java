package Collections;

import java.util.*;

public class HASHMAP {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Mango", 60);
        map.put("Apple", 50);
        map.put("Banana", 50);
        map.put("Orange", 20);
        map.put("Guava", 60);
        map.put("Peach", 20);

        /*System.out.println("By using Iterator");
        Iterator<Map.Entry<String,Integer>>iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> entry = iterator.next();
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }*/
        //By using Comparator
        System.out.println("\nBy using Comparator");
        //convert the map into list
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        //sort this using sort and comparator, sort by value (Ascending)
        //entryList.sort(Comparator.comparing(Map.Entry::getValue));

        //sort this using sort and comparator, sort by Key (Ascending)
        //entryList.sort(Comparator.comparing(Map.Entry::getKey));

        //sort this using sort and comparator, sort by value (Descending)
        //entryList.sort((entry1,entry2)->entry2.getValue().compareTo(entry1.getValue()));

        //sort this using sort and comparator, sort by Key (Descending)
        //entryList.sort((entry1, entry2) -> entry2.getKey().compareTo(entry1.getKey()));


        //When there is duplicate value, and we need to ascending it by key
        //By value
        entryList.sort((e1,e2)->{
            int valueCompare=e1.getValue().compareTo(e2.getValue());
            if(valueCompare==0){
                return e2.getKey().compareTo(e1.getKey());
            }else{
                return valueCompare;
            }
        });

        // Iterate using iterator
        Iterator<Map.Entry<String, Integer>> Comiterator = entryList.iterator();
        while (Comiterator.hasNext()) {
            Map.Entry<String, Integer> entry = Comiterator.next();
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}
