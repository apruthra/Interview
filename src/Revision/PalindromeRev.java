package Revision;

public class PalindromeRev {
    public static void main(String []args){
        String str1="MALAYALAM";
        int length=str1.length()-1;
        char []ch1=str1.toCharArray();
        boolean palindrome=true;

        for (int i=0;i<ch1.length;i++){
            if(ch1[i]==ch1[length]){
                length--;
                palindrome=true;
            }else{
                palindrome=false;
                break;
            }
        }

        System.out.println(palindrome);
    }
}
