package StringProgramming;

import java.util.Arrays;

public class String_Programming_practice {
    public static void main(String[] args) {
        String s = "hello my name is shubham";

        String s1 [] = s.split(" ");
        System.out.println(Arrays.toString(s1));
        String rev = "";

        for (int i = 0; i < s1.length; i++) {

            char[]a=s1[i].toCharArray();
            for (int j = a.length-1; j >=0 ; j--) {
                rev+=a[j];
            }
            System.out.print(rev+" ");

        }

    }


}
