package DSA.ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListBasic {
    public static void main(String[] args) {
        //Integer should be used while declaring a array upfront
        Integer arr1[]={1,2,3,4,5};
        //Lets convert this array to array list of al2
        ArrayList<Integer> converted=new ArrayList<>(Arrays.asList(arr1));
        ArrayList al=new ArrayList();
        ArrayList al1=new ArrayList();
        ArrayList <Integer> al2=new ArrayList<>();
        //add an element as of object
        al.add("Welcome");
        al1.add("you");
        System.out.println(al);
        //Add an entire Collection .Addall
        al.addAll(al1);
        //printing converted array[1, 2, 3, 4, 5]----> ArrayList Arrays.asList(arr1
        System.out.println(converted);
        //Remove obj when it comes to integer below can be used
        converted.remove(Integer.valueOf(5));
        System.out.println(converted);
        //Remove all of an entire collection
        converted.removeAll(al);
        //Retain all of an entire collection
        Integer arr2[]={1,3,5,7,11};
        ArrayList <Integer> Retainer=new ArrayList<>(Arrays.asList(arr2));
        Retainer.retainAll(converted);
        System.out.println(Retainer);

        //Clear an entire collection to empty
        ArrayList<Integer> LetsClear=new ArrayList<>(Arrays.asList(2,3,4,5,9,0));
        LetsClear.clear();
        System.out.println(LetsClear);

        //IsEmpty Returns Boolean value
        boolean isClear=LetsClear.isEmpty();
        System.out.println(isClear);

        //To find the size of an ArrayList is similar to array .length n-1
        System.out.println(Retainer.size());

        //Contains object in Array List
        System.out.println(al.contains("Welcome"));

        //Contains all for "Pass Collection"

        //All these are implementation of above are from "Collection Interface"

        //Below which includes will have operations from Child interface
        System.out.println(al);

        //Null can be initialized in Array List as well
        al.add(2,null);
        System.out.println(al);
        System.out.println(converted);
        //converted.remove("");
        System.out.println(converted);
    }
}
