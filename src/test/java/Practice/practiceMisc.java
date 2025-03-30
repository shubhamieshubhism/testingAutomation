package Practice;

import net.bytebuddy.dynamic.scaffold.MethodGraph;

import javax.mail.search.SearchTerm;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.*;

public class practiceMisc {

    public static int stringToNum(String str){
        int sum = 0;
        String temp = "";
        for(char ch : str.toCharArray()){
            if(Character.isDigit(ch)){
                temp+=ch;
            }else{
                if(!temp.isEmpty()){
                    sum+=Integer.parseInt(temp);
                    temp="";
                }
            }
        }
        if(!temp.isEmpty()){
            sum+=Integer.parseInt(temp);
        }
        return sum;
    }

    public static int mostFreq(int[] arr){
        int maxCOunt=0;
        int mostFreq=-1;
        Map<Integer,Integer> freqCount=new HashMap<>();
        for(int num :arr){
            int count = freqCount.getOrDefault(num,0)+1;
            freqCount.put(num,count);
            if(count>maxCOunt){
                maxCOunt=count;
                mostFreq=num;
            }
        }
        return mostFreq;
    }

    public static void moveZeros(int[]arr){
        int index=0;
        for(int num:arr){
            if(num!=0){
                arr[index++]=num;
            }
        }
        while (index<arr.length){
            arr[index++]=0;
        }
    }





    public static void main(String[] args) {
        String input = "Java is a very good Language Java is java my name is shubham Shubham";




    }
}
