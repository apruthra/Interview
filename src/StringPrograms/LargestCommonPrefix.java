package StringPrograms;

public class LargestCommonPrefix {
    public static void main(String []args){
        String []str1 = {"flower","flow","flight"};
        String small="";
        int smallIndex=0;
        String[] stat=new String[str1.length];
        //To Find Smallest Word in the Array
        for (int i=1;i< str1.length;i++){
            int min=str1[0].length();
            if(str1[i].length()<min){
                    small=str1[i];
                    smallIndex=i;
            }
        }
        System.out.println("Smallest String is : "+small);
        System.out.println("Small Word Index is : "+smallIndex);

        //To Convert Small Into Char Array
        char []ch1=new char[str1.length];
        int charIndex=0;
        int j=0;
        for(int i=0;i< str1.length;i++){
           ch1[charIndex++]=str1[i].charAt(0);

        }
        for(char k:ch1){
            System.out.println(k);
        }


//        for (int i=0;i< st.length;i++){//


  //      }



    }
}
