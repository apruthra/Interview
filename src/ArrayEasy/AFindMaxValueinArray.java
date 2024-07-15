package ArrayEasy;

public class AFindMaxValueinArray {
    public static void main(String[] args) {
        int arr[] = {1000,20, 10, 20, 4, 100,1001};
        int max=arr[0];
        System.out.println("The Length Of the Array is"+arr.length);
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}
