package ArrayMediums;

public class RemoveAllOccureneces {
    public static void main(String[] args) {
        int arr[] = { 3, 9, 2, 3, 1, 7, 2, 3, 5 };
        int arr2[]=new int[arr.length];
        int target=3;
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]!=target){
                arr2[count++]=arr[i];
            }
        }
        for (int y:arr2){
            System.out.println(y);
        }
    }
}
