package ArrayEasy;


public class RemoveElement {
    public static void main(String[] args) {

        //Works Pakka
        int []nums = {3,2,2,3};
        int target=3;
        int count=0;


        for (int i=0;i< nums.length;i++){
            if (nums[i]!=target){
                nums[count++]=nums[i];
            }
        }

        for (int p:nums){
            System.out.println(p);
        }




    }
}
