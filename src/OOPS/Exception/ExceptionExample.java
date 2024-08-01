package OOPS.Exception;

public class ExceptionExample {
    public static void main(String []args) throws Exception {
        int bankBalance=7000;
        int minimumBalance=10000;

        if (bankBalance<=minimumBalance){
            try {
                throw new Exception("Your Balance is too Low");
            }catch(Exception e){
                System.out.println(e);
            }
            finally {
                System.out.println("Deposit : "+(minimumBalance-bankBalance));
            }
        }
    }
}
