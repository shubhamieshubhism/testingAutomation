package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Declaration
        //ArrayList mylist = new ArrayList();
        //List mylist = new ArrayList<>();
        // For creating homogenous list
        // ArrayList<Integer> mylist = new ArrayList<Integer>();
        //ArrayList<String> mylist = new ArrayList<String>();
        //Adding data into ArrayList
        ArrayList mylist = new ArrayList();
        mylist.add(100);
        mylist.add(10.5);
        mylist.add("welcome");
        mylist.add(true);
        mylist.add(null);
        mylist.add(null);
        mylist.add(100);
        System.out.println("Size of an arraylist : " + mylist.size());
        //Printing data from arraylist
        System.out.println("Printing data from a arraylist : " + mylist);
        //Remove item, element from an array
        mylist.remove(0);
        System.out.println("Size of an arraylist : " + mylist.size());
        //insert an element in middle somewhere
        mylist.add(5, "hello");

        //Modify element in the arraylist (modify/replace/change)
        mylist.set(5, "newValue");
        System.out.println("After modification : " + mylist);

        //Specific element How to extract or specific element
        System.out.println(mylist.get(5));
        //how to read all the values, elements
        // using normal for loop
        /*for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }*/
        //using for ..each loop
        /*for(Object x : mylist ){
            System.out.println(x);
    }*/
        //using iterator
        Iterator it = mylist.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        System.out.println(it.next());
        //checking arraylist empty or not
        System.out.println(mylist.isEmpty());

        //remove all the data from arraylist
        //remove multiple element
        ArrayList mylist2= new ArrayList();
        mylist2.add("newValue");
        mylist2.add(10.5);
        mylist2.add(null);

        mylist.removeAll(mylist2);
        System.out.println(mylist);

        //remove all the elements
        mylist.clear();
        System.out.println(mylist.isEmpty());

}
}

