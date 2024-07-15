package StringMethods.StringPrograms;

public class StringPalindrome {
    public static void main(String args[]) {
        String str1="malayalam";

        char ch1[]=str1.toCharArray();
        boolean palindrome=false;

        for (int i=0;i<str1.length();i++){
            if (ch1[i]==ch1[str1.length()-1]){
                palindrome=true;
            }else {
                palindrome=false;
            }
        }
        System.out.println("Is Plaindrome :"+palindrome);

    }

}
