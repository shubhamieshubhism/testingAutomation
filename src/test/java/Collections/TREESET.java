package Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TREESET {


    public static void main(String[] args) {
        //If we want to print the elements in descending order we need to use comparator
       /* Comparator <String> descendingOrd = (s1,s2)-> s2.compareTo(s1);
        Set<String> treeSet = new TreeSet<>(descendingOrd);
        treeSet.add("shubham");
        treeSet.add("hero");
        treeSet.add("zero");
        treeSet.add("wild");

        System.out.println("Elements present in treeSet are in descending order --> ");
        treeSet.forEach((word)-> System.out.println(word));

        System.out.println("For Interger");
        Comparator <Integer> numdescendingOrd = (s1,s2)-> s2-s1;
        Set<Integer> numtreeSet = new TreeSet<>(numdescendingOrd);
        numtreeSet.add(10);
        numtreeSet.add(20);
        numtreeSet.add(2);
        numtreeSet.add(1);
        System.out.println("Elements in descending order Integers");
        numtreeSet.forEach((num)-> System.out.println(num));*/


        Comparator<person>combinedComparator = Comparator.
                comparingInt(person::getAge).
                thenComparing(person::getName);
        TreeSet<person> set = new TreeSet<>(combinedComparator);

        set.add(new person("Alice", 30));
        set.add(new person("Bob", 25));
        set.add(new person("Charlie", 30));
        set.add(new person("David", 25));

        System.out.println("Sorted by age, then name: " + set);
    }
}
class person{
    String name;
    int age;
    public person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return name+"("+age+")";
    }
}
