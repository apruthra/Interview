package Revision;

public class ReverseAString {
    public static void main(String []args){
        String str="Hello World";
        char []ch1=new char[str.length()];
        int index=0;

        for (int i=str.length()-1;i>=0;i--){
            ch1[index++]+=str.charAt(i);
        }
        //Converting the Char array into String
        String str3=new String(ch1);
        System.out.println("As String  : " +str3);

        for (char k:ch1){
            System.out.println(k);
        }




    }
}
