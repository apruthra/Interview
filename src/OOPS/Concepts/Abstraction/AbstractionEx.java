package OOPS.Concepts.Abstraction;

import java.sql.SQLOutput;

abstract class Bank{
    abstract int rateOfInterest();
}
class SBI extends Bank{
    int rateOfInterest(){
        return 8;
    }
}
class HDFC extends Bank{
    int rateOfInterest(){
        return 13;
    }
}
class ICICI extends Bank{
    @Override
    int rateOfInterest() {
        return 15;
    }
}

public class AbstractionEx {
    public static void main(String []args){
        Bank B;
        B=new HDFC();
        System.out.println("Rate Of Interest for HDFC is : "+B.rateOfInterest());
        B=new ICICI();
        System.out.println("Rate Of Interest for HDFC is : "+B.rateOfInterest());


    }
}
