package StringMethods;

public class CharATString {
    public static void main(String args[]) {
        String name = "javatpoint";
        char ch=name.charAt(0);
        System.out.println(ch);

        String str = "Welcome to Javatpoint portal";
        for (int i=0; i<str.length(); i++) {
            if(i%2!=0) {
                System.out.println("Char at "+i+" place "+str.charAt(i));
            }
        }
int count=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='t'){
                count++;
            }
        }
        System.out.println("The Repetetion is "+count);
    }
}
