package DSA.ArraysList;

import java.util.Iterator;
import java.util.LinkedList;

@SuppressWarnings("ALL")
public class ListLinkedList {
    public static void main(String[] args) {
        //Linked list shares all of same implementation in array
        //Some Proprietary Methods are
        LinkedList l=new LinkedList();
        l.add("Peter");
        l.add("Parker");
        l.add("Aunt May");
        l.add("Zendaya");
        l.add("Magneto");

        System.out.println(l);



        //Remove
        l.removeFirst();
        l.removeLast();

        //Add
        l.addFirst("Tony Stark");
        l.addLast("Happy");

        //Retrieve
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        System.out.println(l.get(2));

        System.out.println(l);

        l.add(2,null);

        System.out.println(l);

        //List Iterator using Collections
        Iterator IT=l.iterator();
        while(IT.hasNext()){
            System.out.println(IT.next());
        }


    }
}
