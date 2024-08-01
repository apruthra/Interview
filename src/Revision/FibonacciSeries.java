package Revision;
class fibonacci{
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}

public class FibonacciSeries {
    public static void main(String []args){
        int numberofTerms=10;
        for (int i=0;i<numberofTerms;i++){
            System.out.println(fibonacci.fibonacci(i));

        }

    }
}
