package javaPracticeQuestions;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionExampele {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");//list allows duplicate but set does not allow duplicates

        HashSet<String> set = new HashSet<>(list);
        set.add("Cherry");

        System.out.println("List : " + list);
        System.out.println("Set : " + set);

        /*
        output
        List : [Apple, Banana, Apple]
        Set : [Apple, Cherry, Banana]
        * */
    }
}

class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Name", "Shubham");
        map.put("Occupation", "Tester");

        System.out.println("Name : " + map.get("Name"));
        System.out.println("Occupation : " + map.get("Occupation"));
    }
}

class MapTypeExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        hashMap.put(2, "Apple");
        linkedHashMap.put(2, "Apple");
        treeMap.put(2, "Apple");

        hashMap.put(1, "Banana");
        linkedHashMap.put(1, "Banana");
        treeMap.put(1, "Banana");

        System.out.println("HashMap : " + hashMap);
        System.out.println("LinkedHashMap : " + linkedHashMap);
        System.out.println("TreeMap : " + treeMap);
    }
}

class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {

            int value = iterator.next();
            if (value > 2) {
                System.out.println(value);
            }
        }
    }
}


class CollectionUtilityExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(9);
        list.add(10);

        Collections.sort(list);
        System.out.println("Sorted Array : " + list);
        int index = Collections.binarySearch(list, 9);
        System.out.println("The index : " + index);
    }

}

class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Task1");
        queue.add("Task2");
        queue.add("Task3");
        System.out.println("Queue: " + queue);
        System.out.println("Head: " + queue.peek()); // Retrieves but does not remove the head

        System.out.println("Removed: " + queue.poll()); // Removes the head
        System.out.println("Queue after removal: " + queue);
    }
}

class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(20);
        pq.add(40);
        System.out.println("Priority Queue: " + pq);
        System.out.println("Polled Element: " + pq.poll()); // Removes the smallest element

        System.out.println("Priority Queue after polling: " + pq);
    }
}

class RetainAllExample {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Banana");

        List<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Cherry");

        list1.retainAll(list2); // Retains only "Apple"

        System.out.println("After retainAll: " + list1); // Output: [Apple]
        System.out.println("After retainAll: " + list2);
    }
}

class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.stream().filter(n -> n < 3).forEach(System.out::println); //Filters and prints numbers > 1

    }
}

class CollectorsExample {
    public static void main(String[] args) {
        //Map<String, Integer> map = Stream.of("Apple","Banana","Mosambii").collect(Collectors.toMap(s->s,String::length));
        Map<String, String> map = Stream.of("Apple", "Banana", "Mosambii").collect(Collectors.toMap(s -> s, String::trim));
        System.out.println("Map : " + map);


    }
}

class Employee {
    int id;
    String name;

    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class ToMapExample4 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice"),
                new Employee(2, "Bob"),
                new Employee(4, "will")
        );

        Map<Integer, String> map = employees.stream().collect(Collectors.toMap(
                e -> e.id,
                e -> e.name
        ));

        System.out.println(map); // Output: {1=Alice, 2=Bob}
    }
}
class SocialMediaFeed{
    public static void main(String[] args) {
        Deque<String> feed= new ArrayDeque<>();
        feed.addFirst("First post");
        feed.addFirst("Second post");

        System.out.println("Latest Post : "+feed.removeFirst());
    }
}

class ProductCatalog {
    public static void main(String[] args) {
        TreeMap<Integer, String> products = new TreeMap<>();
        products.put(150, "Smartphone");
        products.put(1200, "Laptop");
        products.put(300, "Tablet");
        System.out.println("All Products: " + products);
        System.out.println("Products under $500: " + products.headMap(500));
        System.out.println("Products Between $100 to $500: " + products.subMap(100,500));
        System.out.println("Products above $500: " + products.tailMap(500));

    }
}