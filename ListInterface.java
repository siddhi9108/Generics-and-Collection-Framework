package javaapplication2;

import java.util.*;

public class ListInterface {

    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<>();
        System.out.println(ob.size());
        System.out.println("===========================");
        ob.add("A");
        ob.add("B");
        ob.add("C");
        ob.add("D");
        ob.add(1, "E");
        System.out.println(ob);
        System.out.println(ob.indexOf("C"));
        System.out.println(ob.lastIndexOf("Z"));

    }
}
