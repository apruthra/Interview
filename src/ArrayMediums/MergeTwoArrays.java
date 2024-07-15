package ArrayMediums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 5};
        int arr2[] = {2, 4, 6, 8};
        int i;

        List <Integer> Merge=new ArrayList<>();

        for ( i=0;i<arr1.length;i++){
            Merge.add(arr1[i]);
        }
        for (i=0;i<arr2.length;i++){
            Merge.add(arr2[i]);
        }

        for( int k: Merge){
            System.out.print(k+" ");
        }

        //int arr3[]=Merge.toArray

    }
}
