package StringMethods;

public class StartsWith {
    public static void main(String args[]){
        String str1="Daemon Rides Caraxes";
        System.out.println(str1.startsWith("Daemon"));
        System.out.println(str1.startsWith("mon",3));
    }
}
