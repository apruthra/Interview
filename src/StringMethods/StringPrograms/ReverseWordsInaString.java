package StringMethods.StringPrograms;

public class ReverseWordsInaString {
    public static void main(String []args){
        String s="the sky is blue";
        String []str=s.trim().split("\\s+");

        int count=0;
        String []str2=new String[str.length];
        for(int i=str.length-1;i>=0;i--){
            str2[count]=str[i];
            count++;
        }

        String str3=String.join(" ",str2);
        System.out.println(str3);



    }
}
