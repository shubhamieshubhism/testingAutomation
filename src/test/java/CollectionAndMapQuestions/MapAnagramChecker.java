package CollectionAndMapQuestions;

import java.util.HashMap;

public class MapAnagramChecker {

    public static boolean areAnagram(String str1, String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        HashMap<Character,Integer>charCountMap = new HashMap<>();
        for(char ch : str1.toCharArray()){
            charCountMap.put(ch,charCountMap.getOrDefault(ch,0)+1);
        }

        for(char ch: str2.toCharArray()){
            if(!charCountMap.containsKey(ch)){
                return false; //str2 does not contains str1 elements
            }
            charCountMap.put(ch,charCountMap.get(ch)-1);
            if(charCountMap.get(ch)==0){
                charCountMap.remove(ch);
            }
        }
        return charCountMap.isEmpty();
    }

    public static void main(String[] args) {
        String one = "caree";
        String two = "racec";
        if(areAnagram(one,two)){
            System.out.println("They are anagram");
        }else{
            System.out.println("They are not anagram");
        }
    }

}
