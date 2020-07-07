package javaapplication2;

import java.util.*;

public class Sublist_RetrivingItems {

    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<>();
        System.out.println(ob.size());
        System.out.println("===========================");
        ob.add("A");
        ob.add("B");
        ob.add("C");
        ob.add("D");
        ob.add("E");
        ob.add("F");
        List<String> list1 = ob.subList(1, 5);
        for (String s : list1) {
            System.out.println(s);

        }
    }
}
