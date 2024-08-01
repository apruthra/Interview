package DSA.HashMapCollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashmAp2 {
    public static void main(String[] args) {
        //Declarations
        HashMap m = new HashMap<>();
        // Using specific data types for both key and value
        HashMap <Integer,String> m1=new HashMap<Integer,String>();
        //For m any input will be considered as object as no data type is given
        m1.put(20000,"Nord CE 2");
        m1.put(20000,"Nord 2");
        m1.put(35000,"Oneplus 9RT");
        m1.put(64000,"Oneplus 12 Flasgship");
        System.out.println(m1);


        m.put(100000,"Iphone 15b Pro");
        m.put(150000,"Iphone 15 Pro Max");
        System.out.println(m);

        //Returns all of the keys as setObject
        //System.out.println(m1.keySet()); workable
        Set m2=m1.keySet();
        System.out.println(m2);

        //To return all of the values stored in hashMap , Duplicates are allowed so there is no possiblity of set use here
        System.out.println(m1.values()); // Returned as collection

        //Entry Set is anew concept and an sub interface of Map Interface
        System.out.println(m1.entrySet());//Print Keys and Pairs

        //Iterator
        Set s=m1.entrySet();

        Iterator itr=s.iterator();

        while(itr.hasNext()){
            Map.Entry entry=(Map.Entry) itr.next();
            System.out.println(entry.getKey()+"     :     "+entry.getValue());
        }


    }
}
