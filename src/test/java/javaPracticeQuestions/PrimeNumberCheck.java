package javaPracticeQuestions;

public class PrimeNumberCheck {
    public static void primeNoCheck(int num){
        int count = 0;

        for(int i =1 ; i<=num ; i++){

            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }

    /*Another way to find the prime number is in the below method*/
    public static boolean isPrimeNo(int num){
        if(num<=1) return false;

        //check divisibility from i=2 to i=num/2
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false; //if divisible not a prime number
            }
        }
        return true; //if not divisible prime number
    }

    public static void main(String[] args) {
        int input = 17;
        primeNoCheck(input);
    }
}
