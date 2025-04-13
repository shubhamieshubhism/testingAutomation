package Practice;

import net.bytebuddy.dynamic.scaffold.MethodGraph;

import javax.mail.search.SearchTerm;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class practiceMisc {

    public static int stringToNum(String str) {
        int sum = 0;
        String temp = "";
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                if (!temp.isEmpty()) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        if (!temp.isEmpty()) {
            sum += Integer.parseInt(temp);
        }
        return sum;
    }

    public static int mostFreq(int[] arr) {
        int maxCOunt = 0;
        int mostFreq = -1;
        Map<Integer, Integer> freqCount = new HashMap<>();
        for (int num : arr) {
            int count = freqCount.getOrDefault(num, 0) + 1;
            freqCount.put(num, count);
            if (count > maxCOunt) {
                maxCOunt = count;
                mostFreq = num;
            }
        }
        return mostFreq;
    }



    public static String maxFreqWord(String str) {
        String[] words = str.toLowerCase().split("\\s+");
        Map<String, Integer> freqCount = new HashMap<>();
        for (String word : words) {
            freqCount.put(word, freqCount.getOrDefault(word, 0) + 1);

        }
        int maxCount = 0;
        String maxFreq = "";
        for (Map.Entry<String, Integer> entry : freqCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxFreq = entry.getKey();
            }
        }
        return maxFreq;
    }

    public static void moveZeros(int[] arr) {
        int index = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static boolean isPalindrome(String str){
        int left=0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void findPalindrome(String str){
        for(int i =0 ; i < str.length();i++){
            for(int j = i+1;j<=str.length();j++){
                String subString = str.substring(i,j);
                if(isPalindrome(subString) && subString.length()>3){
                    System.out.println(subString);
                }
            }
        }
    }


    public static void main(String[] args) {

        String input = "madam is level noon racecar";
        String []words = input.toLowerCase().split("\\s+");
        for(String word : words){
            if(isPalindrome(word)){
                System.out.println(word);
            }
        }


    }
}
