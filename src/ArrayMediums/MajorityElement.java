package ArrayMediums;

public class MajorityElement {
    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        int elementCount;
        int lastelementCount = 0;
        int Max = 0;

        for (int i = 0; i < nums.length; i++) {
            elementCount = 1;  // Reset elementCount for each new element i
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    elementCount++;
                }
            }
            if (elementCount > lastelementCount) {
                lastelementCount = elementCount;
                Max = nums[i];
            }
        }
        System.out.println(Max);


    }
}
