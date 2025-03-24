package Interview;

import org.openqa.selenium.devtools.v122.overlay.model.LineStyle;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterviewBirdEye {


    public static void main(String[] args) {

        List<String> capitals = new ArrayList<>();
        capitals.add("Chennai");
        capitals.add("Mumbai");
        capitals.add("Gandhinager2");

        List<String> capitals1 = new ArrayList<>();
        capitals1.add("Chennai");
        capitals1.add("Mumbai");
        capitals1.add("Gandhinager");
        capitals1.add("Chandigar");

        List<String> biggerList, smallList;
        if (capitals.size() > capitals1.size()) {
            biggerList = capitals;
            smallList = capitals1;
        } else {
            biggerList = capitals1;
            smallList = capitals;
        }
        List<String> diff = new ArrayList<>(biggerList);
        diff.removeAll(smallList);
        System.out.println("Big list " + biggerList);
        System.out.println("Small list " + smallList);
        System.out.println("difference " + diff);
    }
}

