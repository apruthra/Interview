package StringPrograms;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String args[]) {
        //Remember Case Sensitive
        String str1="dusty";
        String str2="study";
        boolean Anagram=false;

        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i=0;i<str1.length();i++){
            if (ch1[i]==ch2[i]){
                Anagram=true;
            }else {
                Anagram=false;
                break;
            }
        }

        System.out.println("Is It an Anagram :"+Anagram);


    }
}
