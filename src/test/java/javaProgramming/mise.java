package javaProgramming;

import java.util.stream.IntStream;

public class mise {
    public static void main(String[] args) {
        //Using IntStream.range() for Numeric Loops
        IntStream.range(1,11).forEach(i-> System.out.println("10 * "+i+" = "+i*10));
        IntStream.range(1,11).forEach(i-> System.out.println("Number --> "+i));


    }
}
