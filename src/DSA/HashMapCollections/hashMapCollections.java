package DSA.HashMapCollections;

import java.util.HashMap;

public class hashMapCollections {
    public static void main(String[] args) {
        //Declarations
        HashMap m = new HashMap<>();
        // Using specific data types for both key and value
        HashMap <Integer,String> m1=new HashMap<Integer,String>();
        //For m any input will be considered as object as no data type is given
        m1.put(20000,"Nord CE 2");
        m1.put(28000,"Nord 2");
        m1.put(35000,"Oneplus 9RT");
        m1.put(64000,"Oneplus 12 Flasgship");
        System.out.println(m1);


        m.put(100000,"Iphone 15b Pro");
        m.put(150000,"Iphone 15 Pro Max");

        m1.putAll(m);
        System.out.println(m1);

        //To get Value
        System.out.println(m1.get(28000));

        /*To Get Key ----- > Not Possible
        System.out.println(m1.get());*/

        //Remove using Key
        m.remove(100000);
        System.out.println(m);

        //To check if element is present in Map or not using key
        System.out.println(m1.containsKey(20000));
        //Same for values
        System.out.println(m1.containsValue("Oneplus 12 Flasgship"));

        m1.isEmpty();
        //size
        System.out.println(m1.size());
        //m.clear();
        System.out.println();

        //Basics of HashMap are done refer 2




    }
}
