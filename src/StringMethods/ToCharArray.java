package StringMethods;

public class ToCharArray {
    public static void main(String args[]){
        String str = "I love bike and I have a bike";
        char ch1[]=str.toCharArray();
        for(char k:ch1){
            System.out.println(k);
        }
        //Using New Keyword
        String str4=new String(ch1);
        System.out.println(str4);
        //Using Value of
        String str5=String.valueOf(ch1);
        System.out.println(str5);
    }
}
