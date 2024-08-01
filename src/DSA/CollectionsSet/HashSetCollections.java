package DSA.CollectionsSet;

import java.util.HashSet;

public class HashSetCollections {
    public static void main(String[] args) {
        //Declarations
        HashSet hs=new HashSet();
        //initial capacity 100
        HashSet hs1=new HashSet(100);
        //With Load Factor
        HashSet <Integer> hs2=new HashSet<>();
        hs2.add(1);
        hs2.add(2);
        hs2.add(3);
        hs2.add(4);
        hs2.add(5);
        HashSet <Integer> hs3=new HashSet<>();
        hs3.add(3);
        hs3.add(4);
        hs3.add(5);

        //Union
        //hs2.addAll(hs3);
        //System.out.println("The union :"+hs2);
        //Intersection
        //hs2.retainAll(hs3);
        //System.out.println("The Intersection :"+hs2);

        //Difference
        //hs2.removeAll(hs3);
        //System.out.println("The Difference is :"+hs2);
        System.out.println(hs2.containsAll(hs3));








    }
}
