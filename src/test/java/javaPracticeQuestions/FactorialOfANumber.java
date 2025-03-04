package javaPracticeQuestions;

public class FactorialOfANumber {

    public static void factorialOfNumber(int num){

        int fact=1;
        for(int i = 1; i<=num ; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+ fact);
    }

    public static void factorialOfNumbers(int num){


        while(num>0){
            int rem = num%10;
            int fact = 1;
            for(int i = 1 ; i <=rem ;i++){
                fact=fact*i;
            }
            System.out.println("The factorial of "+rem+" is "+fact);
            num/=10;
        }
    }

    public static void main(String[] args) {
        factorialOfNumber(5);
        factorialOfNumbers(345);

    }
}
