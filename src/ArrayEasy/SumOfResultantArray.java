package ArrayEasy;

public class SumOfResultantArray {
    public static void main(String[] args) {
        int arr1[] = {2, 2, 5, 4,0,7,1};
        int target=9;

        for (int i=0;i<arr1.length;i++){
            for (int j=i+1;j<arr1.length;j++){
                if (arr1[i]+arr1[j]==target){
                    System.out.println(arr1[i] +" "+arr1[j]);
                }
            }
        }


    }
}
