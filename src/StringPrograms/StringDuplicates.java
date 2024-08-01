package StringPrograms;

import java.util.Arrays;

public class StringDuplicates {
    public static void main(String args[]) {
        String str1="PodaVenna";

        char ch1[]=str1.toCharArray();
        Arrays.sort(ch1);
        String str2="";

        int j=1;
        for (int i=1;i<str1.length();i++){
            if (ch1[i]!=ch1[i-1]){
                str2+=ch1[i];
                j++;
            }
        }
        System.out.println("The String str2 : "+str2);




    }
}
