package DSA.QueueCollections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueHandson {
    public static void main(String[] args) {
        //Declaration
        PriorityQueue q=new PriorityQueue<>();
        //Add and Offer adds in the tail section of the element
        q.add("A");
        q.add("B");
        q.add("C");
        q.offer("C");

        //System.out.println(q);
        //Get head element from empty queue
        //System.out.println(q.element());//Return exception if empty
        //Get Head element , If no element retrund null
        //System.out.println(q.peek());//Returns null

        //Remove and Poll for removing header element
        //System.out.println(q.remove()); // Removes and Returns the element
        //System.out.println(q.poll()); // If empty returns null or just removes and returns

        Iterator IT=q.iterator();
        while(IT.hasNext()){
            System.out.println(IT.next());
        }

        //Only Homogeneous data allowed in priority Queue
        //Duplicates are allowed
        //same can be implemented using link list for heterogeneous data
        LinkedList q2=new LinkedList<>();




    }
}
