package DSA.NormalList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TeluskoList {
    public static void main(String[] args) {
        List <Integer> values=new ArrayList<>();
        values.add(10);
        values.add(5);
        values.add(15);
        values.add(2,9);
        Collections.sort(values);
        values.forEach(System.out::print);

    }
}
