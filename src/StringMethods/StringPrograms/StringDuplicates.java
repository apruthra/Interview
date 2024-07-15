package StringMethods.StringPrograms;

public class StringDuplicates {
    public static void main(String args[]) {
        String str1="ABBCCDDEEA";

        char ch1[]=str1.toCharArray();

        int j=1;
        for (int i=1;i<str1.length();i++){
            if (ch1[i]!=ch1[i-1]){
                ch1[j]=ch1[i];
                j++;
            }
        }


        for (int i=0;i<j-1;i++){
            System.out.println(ch1[i]);
        }

    }
}
