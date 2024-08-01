package Intellect;

import java.util.Arrays;

public class RemoveDupeinteger {
    public static void main(String []args){
        int nums[] = {1, 1,1,2, 2, 3, 4, 4, 4, 5, 5};
        Arrays.sort(nums);
        int nums2[]=new int[nums.length];
        int index=0;

        nums2[index++] = nums[0];

        for (int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums2[index++]=nums[i];
            }

        }
        for(int i=0;i<index;i++){
            System.out.println(nums2[i]);
        }



    }
}
