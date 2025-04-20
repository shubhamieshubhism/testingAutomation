package javaPracticeQuestions;

public class FibonacciSeries {
    public static void fibonacciSeries(int num){
        int first =0;
        int second=1;
        for(int i =0 ; i<=num;i++){
            System.out.print(first+" ");
            int next = first+second;
            first=second;
            second=next;
        }
    }

    public static void main(String[] args) {
        fibonacciSeries(8);
    }
}
