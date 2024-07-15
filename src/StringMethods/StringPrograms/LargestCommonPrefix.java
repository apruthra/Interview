package StringMethods.StringPrograms;

public class LargestCommonPrefix {
    public static void main(String []args){
        String []str1 = {"flower","flow","flight"};
        String small="";
        String[] stat=new String[str1.length];
        //To Find Smallest Word in the Array
        for (int i=1;i< str1.length;i++){
            int min=str1[0].length();
            if(str1[i].length()<min){
                    small=str1[i];
            }
        }
        System.out.println("Smallest String is : "+small);

        //To Convert Small Into Char Array
        int i=small.length()-1;
        System.out.println(i);
        while(i!=0){

        }


//        for (int i=0;i< st.length;i++){


  //      }



    }
}
