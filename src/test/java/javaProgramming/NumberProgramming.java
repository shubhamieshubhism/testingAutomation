package javaProgramming;

public class NumberProgramming {
    public static void main(String[] args) {
        prime_number(14);
        factorial(6);
        factorial_each_digit(785);

    }
    public static void prime_number(int num){
        int n = num;
        int count = 0;
        for(int i = 1 ; i <=n ; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("The number is prime number");
        }else{
            System.out.println("The number is not a prime number");
        }
    }

    public static void factorial(int num){
        int n = num;
        int fact=1;
        for(int i = 1 ; i<=n ;i++){
            fact*=i;
        }
        System.out.println("The factorial of "+n+" "+fact);
    }

    public static void factorial_each_digit(int num){
        int n = num;
        while (n>0){
            int rem = n%10;
            int fact = 1;
            for(int i = 1 ; i<=rem ; i++){
                fact*=i;
            }
            System.out.println("the factorial of "+rem+" is "+fact);
            n/=10;
        }
    }
}
