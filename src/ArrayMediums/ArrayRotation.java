package ArrayMediums;

public class ArrayRotation {
    public static void main(String[] args) {
        int nums[] = {-1,-100,3,99};
        int d = 2;
        int count=0;
        int temp[]=new int[nums.length];
        //First Rotation
        for (int i=d;i<nums.length;i++){
            temp[count++]=nums[i];
        }
        //Second Rotation
        for (int i=0;i<d;i++){
            temp[count++]=nums[i];
        }
        //Copy to 1st Array
        for (int i=0;i<nums.length;i++){
            nums[i]=temp[i];
        }
        for (int k:nums){
            System.out.println(k);
        }



    }
}
