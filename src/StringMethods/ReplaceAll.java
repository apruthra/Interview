package StringMethods;

public class ReplaceAll {
    public static void main(String args[]){
        String str1="I love bike and I have a bike";
        //Replace one character with other
        String str2=str1.replaceAll("\\s","0");
        System.out.println(str2);
        String str3=str1.replaceAll("o","q");
        System.out.println(str3);
        String str4=str1.replaceAll("I","We");
        System.out.println(str4);

        //Remove spaces
        String str5=str1.replaceAll("\\s+","");
        System.out.println(str5);
        //Add Space before all Characters of the String
        String str = "JavaTpoint";
        String regex="";
        str=str.replaceAll(regex," ");
        System.out.println(str);
    }
}
