package StringPrograms;

public class StringPalindrome {
    public static void main(String args[]) {
        String str1="noon";

        char ch1[]=str1.toCharArray();
        int len=str1.length()-1;
        boolean palindrome=false;

        for (int i=0;i<str1.length();i++){
            if (ch1[i]==ch1[len--]){
                palindrome=true;
            }else {
                palindrome=false;
                break;
            }
        }
        System.out.println("Is Plaindrome :"+palindrome);

    }

}
