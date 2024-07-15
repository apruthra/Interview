package ArrayMediums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};

        int j=1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        //return j;
        System.out.println(j);
        for (int k:nums){
            System.out.println(k);
        }
    }
}
