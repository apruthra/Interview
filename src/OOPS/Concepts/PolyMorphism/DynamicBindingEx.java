package OOPS.Concepts.PolyMorphism;
class Bank{
    public int rateOfInterest(){
        return 5;
    }
}
class SBI extends Bank{
    public int rateOfInterest(){
        return 8;
    }
        }
class HDFC extends Bank{
    public int rateOfInterest(){
        return 13;
    }
}
class ICICI extends Bank{
    public int rateOfInterest(){
        return 15;
    }
}


public class DynamicBindingEx {
    public static void main(String []args){
        Bank b1=new SBI();
        System.out.println(b1.rateOfInterest());
    }
}
