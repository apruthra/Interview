package Revision;

public class PrimeNumbers {
    public static void main(String []args){
        boolean isPrime = true;
        for(int k=0;k<=100;k++) {

            for (int i = 2; i < k; i++) {
                if (k % i == 0) {
                    isPrime = false;
                }
            }
            System.out.println("Is Prime : "+k+" "+isPrime);
            isPrime=true;
        }

    }
}
