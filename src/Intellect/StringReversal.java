package Intellect;

public class StringReversal {
    public static void main(String []args){
        String str1="Hey Good Morning!";
        char []ch1=str1.toCharArray();
        char []ch2=new char[str1.length()];
        int index=0;

        for (int i= str1.length()-1;i>=0;i--){
            ch2[index++]=ch1[i];
        }

        String str2=new String(ch2);
        System.out.println(ch2);


    }
}
