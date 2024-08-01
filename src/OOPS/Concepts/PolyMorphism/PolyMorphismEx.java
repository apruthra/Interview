package OOPS.Concepts.PolyMorphism;

import org.w3c.dom.ls.LSOutput;

class Bike{
    void run(){
        System.out.println("The Bike Is Running Safely");
    }
}
class Honda extends Bike{
    void run(){
        System.out.println("The Honda Bike is Running safely");
    }
}
public class PolyMorphismEx {
    public static void main (String [] args){
        Bike motorcycle=new Honda();
        motorcycle.run();

    }
}
