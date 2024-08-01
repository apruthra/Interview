package OOPS.Concepts.PolyMorphism;
class dog{
    public void run(){
        System.out.println("Dog Eats Dog Food");
    }
}

public class StaticBindingEx {
    public static void main(String []args){
        dog d1=new dog();
        d1.run();

    }
}
