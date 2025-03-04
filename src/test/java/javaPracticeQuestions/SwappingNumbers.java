package javaPracticeQuestions;

public class SwappingNumbers {
    public static void swappingNumber(int num1, int num2){
        System.out.println("Before swapping num1 = "+num1+" \nAfter swapping num2 = "+num2);
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("After swapping num1 = "+num1+" \nAfter swapping num2 = "+num2);
    }
    public static void main(String[] args) {
        swappingNumber(5,6);
    }
}
