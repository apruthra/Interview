package StringMethods.StringPrograms;

public class LengthOfLastWord {
    public static void main(String []args){
        String str1="Hello World";
        String []str2=str1.split("\\s+");
        for (String k:str2){
            System.out.println(k);
        }
        String m=str2[str2.length-1];

        //return m.length();
    }
}
