package javaapplication2;

import java.util.*;

public class CollectionInterfaceMethod{

    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<>();
        System.out.println(ob.size());
        System.out.println("===========================");
        ob.add("A");
        ob.add("B");
        ob.add("C");
        ob.add("D");
        //ob.clear();
        ob.remove(0);
        System.out.println(ob);
        //ob.remove("C");
        System.out.println(ob.contains("Z"));
        System.out.println(ob.size());

    }
}
