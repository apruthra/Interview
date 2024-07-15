package StringMethods.StringPrograms;

public class StringReversalEach {
    public static void main(String args[]) {
        String originalString = "Welcome to interview";
        String str2[]=originalString.split(" ");
        for (String str:str2){
            System.out.print(str+" ");
        }
        char ch1[]=originalString.toCharArray();
        char ch2[]=new char[ch1.length];
        int j=0;

        //System.out.println(ch1[ch1.length-1]);
        for (int m=0;m<str2.length;m++) {
                str2[m].toString();

                for (int i = ch1.length - 1; i >= 0; i--) {
                    ch2[j++] = ch1[i];
                    }
                }

        for (char k : ch2) {
            System.out.print(k);
        }

    }
}
