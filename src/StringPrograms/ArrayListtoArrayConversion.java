package StringPrograms;

public class ArrayListtoArrayConversion {
    public static void main(String args[]) {
        /*Intege\
        arr1[] = { 1, 3, 4, 5};
        ArrayList ar=new ArrayList(Arrays.asList(arr1));

        for(Integer i=0;i<ar.size();i++){

            System.out.println( ar.get(i));
        }*/

                int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
                int arr2[]=new int[arr.length];
                int count=1;



                for (int i=1;i<arr.length;i++){
                    if(arr[i]!=arr[i-1]){
                        arr2[count++]=arr[i];
                    }
                }


        System.out.println(count);
                //return count;


    }
}
