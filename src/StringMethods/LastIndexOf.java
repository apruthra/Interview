package StringMethods;

public class LastIndexOf {
    public static void main(String args[]){
        String str1="FIRSTNAME#MIDDLENAME#LASTNAME@AGE";
        System.out.println(str1.lastIndexOf("#"));
        System.out.println(str1.lastIndexOf("@"));
        int start=str1.lastIndexOf("#")+1;
        int end=str1.lastIndexOf("@");
        for(int i=start;i<end;i++){
            System.out.print(str1.charAt(i));
        }
        System.out.println(str1);
        //After Certain Index, From Index is the Range for Search
        //It will Search bw the Range only
        System.out.println(str1.lastIndexOf("A",130));
        //We can search Substring too
        System.out.println(str1.lastIndexOf("MID",30));
    }
}
