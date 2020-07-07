package javaapplication2;

import java.util.*;

public class ListIteratorForward_Backward {

    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<>();
        System.out.println(ob.size());
        System.out.println("===========================");
        ob.add("A");
        ob.add("B");
        ob.add("C");
        ob.add("D");
        ob.add(1, "E");
        ListIterator<String> it = ob.listIterator();
        System.out.println("Forward");
        while (it.hasNext()) {
            String n = it.next();
            System.out.println(n);
        }
        System.out.println("Backward");
        while (it.hasPrevious()) {
            String n = it.previous();
            System.out.println(n);
        }
    }
}
