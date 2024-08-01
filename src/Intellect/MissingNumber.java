package Intellect;

public class MissingNumber {
    public static void main(String []args){
        int []arr1={1,2,3,4,5,6,7,9};
        int actualSum=0;
        int expectedSum=0;

        for(int i=0;i<arr1.length;i++){
            actualSum+=arr1[i];
        }

        int n=arr1[arr1.length-1];
        expectedSum=(n*(n+1))/2;

        System.out.println(actualSum);
        System.out.println(expectedSum);

        int missingNumber=expectedSum-actualSum;
        System.out.println(missingNumber);
    }
}
