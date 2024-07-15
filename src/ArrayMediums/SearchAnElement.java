package ArrayMediums;

public class SearchAnElement {
    public static void main(String[] args) {
        int arr[] = {5, 1, 1, 7, 0, 2, 6, 10};
        int target=7;
        boolean exists=false;

        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                exists=true;
            }
        }

        if (exists){
            System.out.println("Element Exists");
        }else
            System.out.println("Element Not Found");
    }
}
