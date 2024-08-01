package OOPS.Exception;
class minimumBalanceException extends Exception{
    public minimumBalanceException(String message) {
        //super(message);
    }
}

public class ExceptionExample2 {
    public static void main(String args[]) throws minimumBalanceException{

        int bankBalance=7000;
        int minimumBalance=10000;

        if (bankBalance<=minimumBalance) {

            throw new minimumBalanceException("Your Balance is too Low");
        }


    }
}
