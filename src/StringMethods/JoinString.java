package StringMethods;

public class JoinString {
    public static void main(String []args) {
        String str = "I love bike and I have a bike";
        String str2="Hey Buddy ";
        String str3=String.join(" ","I love" ,"bike" ,"and", "I" ,"have", "a" +"bike");
        System.out.println(str3);
    }



}
