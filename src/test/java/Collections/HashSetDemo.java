package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        //declaration
        HashSet myset = new HashSet();
        //Set myset = new HashSet();
        //To store homogenous data
        //HashSet<String> myset = new HashSet<String>();
        //Adding element in to hashset
        myset.add("hello");
        myset.add(100);
        myset.add(100);
        myset.add(null);
        myset.add(null);
        myset.add(true);
        myset.add('a');
        System.out.println("Original Set : "+myset);
        //remove specific element hashset
        myset.remove(null);
        System.out.println("After removing : "+myset);
        //Inserting element is not possible in hashset
        //Access specific element or retrieving the value of specific element
        //Accessing or retrieving the value is not possible in Hashset directly.
        //After converting set collection to arraylist collection we can achieve above condition
        ArrayList a1 = new ArrayList(myset);
        System.out.println("After converting : "+a1);
        System.out.println("Get access or retrieve element : "+a1.get(2));
        //Read all the elements using looping statement
        for(Object x: myset) {
            System.out.println(x);
        }

        //Using Iterator
        Iterator it = myset.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("Size of hashset : "+myset.size());
        //clearing set
        myset.clear();
        System.out.println(myset.isEmpty());
        }

    }

