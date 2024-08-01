package Revision;

public class StringDupe {
    public static void main(String []args){
        String str1="ABBCCDDEE";
        char []ch1=str1.toCharArray();
        String fin="";

        for (int i=1;i<ch1.length;i++){

            if (ch1[i]!=ch1[i-1]){
                fin+=ch1[i];
            }
        }
        System.out.println(fin);

    }
}
