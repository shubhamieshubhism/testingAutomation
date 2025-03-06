package javaPracticeQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateThroughHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "JavaScript");
        // Iterating using entrySet() and enhanced for-loop
        System.out.println("Using enhance for loop and entrySet()");
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("Key : "+entry.getKey()+" --> "+"Value : "+entry.getValue());
        }

        //Using forEach() and Lambda Expression (Java 8+)
        System.out.println("\nUsing forEach() and Lambda Expression (Java 8+)");
        map.forEach((key,value) -> System.out.println("key : "+key+" value : "+value));

        //Using an Iterator (For Large HashMaps)
        Iterator<Map.Entry<Integer,String>>iterator = map.entrySet().iterator();
        System.out.println("\nUsing an Iterator (For Large HashMaps)");
        while(iterator.hasNext()){
            Map.Entry<Integer,String> entry = iterator.next();
            System.out.println("Key : "+entry.getKey()+" --> "+" Value"+entry.getValue());
        }
        }
    }

