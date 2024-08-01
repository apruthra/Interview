package Revision;

public class MinAndMaxInArray {
    public static void main(String []args){
        int []arr1={1,22,99,33,44,13,45,77,99,1002,11};
        int min=arr1[0];
        int max=arr1[0];
        for (int i=0;i<arr1.length;i++){
            //to Find min
            if(arr1[i]<min){
                min=arr1[i];
            }
            if (max<arr1[i]){
                max=arr1[i];
            }
        }
        System.out.println("This is Min : "+min);
        System.out.println("This is Max : "+max);
    }
}
