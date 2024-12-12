package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        //Declaration
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        //Map hm = new HashMap();
        //Adding pairs
        hm.put(1,"shubham");
        hm.put(2,"hero");
        hm.put(3,"naruto");
        hm.put(4,"luffy");
        hm.put(1,"zoro");
        System.out.println(hm);
        System.out.println("Size of a hashmap : "+hm.size());
        //Remove pair
        hm.remove(2);
        System.out.println("After removing pair : "+hm);
        //Access value of particular key
        System.out.println("Accessing element : "+hm.get(1));
        //Retrieve all the keys from hashmap
        System.out.println("Returning all the keys : "+hm.keySet());
        //Retrieving all the values
        System.out.println("Returning all the value : "+hm.values());
        //Retrieve key and values
        System.out.println("Returning all the keys and values : "+hm.entrySet());
        //Reading data from hashmap
        //Using for each loop
        /*for(int k : hm.keySet()){
            System.out.println(k+"   "+hm.get(k));
        }*/
        //Using iterator
        Iterator<Map.Entry<Integer,String>> it=hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry <Integer,String>entry=it.next();
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
        hm.clear();
        System.out.println(hm.isEmpty());

    }
}
