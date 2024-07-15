package StringMethods;

public class SplitString {
    public static void main(String args[]){
        String str1="I love bike and I have a bike";
        String str2[]=str1.split("\\s+");
        for (String k:str2){
            System.out.println(k);
        }
        //System.out.println(str1.split("\\s",2));
        //String str3=

    }
}
