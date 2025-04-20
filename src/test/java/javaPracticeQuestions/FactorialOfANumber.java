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

    public static void sumOfFactorialOfNumber(int num){
        int sum=0;
        while(num>0){
            int digit =num%10;
            sum+=factorial(digit);
            num/=10;
        }
        System.out.println("The sum of factorials : "+sum);
    }
    public static int factorial(int num){
        int fact =1;
        for(int i=2;i<=num;i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        factorialOfNumber(5);
        factorialOfNumbers(345);
        sumOfFactorialOfNumber(345);

    }
}
