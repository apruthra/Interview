package ArrayEasy;

public class eArrayRotationREV {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};


        int d = 2;
        int i;

        int arr2[]=new int[arr.length];
        //Last Filling

        for (i=0;i<arr2.length-d;i++){
            arr2[i]=arr[i+d];
        }
        for(int j=0;j<d;j++){
            arr2[i++]=arr[j];
        }


        for (int l:arr2){
            System.out.print(l);
        }
    }
}
