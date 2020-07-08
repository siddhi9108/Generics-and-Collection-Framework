package javaapplication2;

import java.util.TreeSet;

public class Tree_Set {

    public static void main(String[] args) {
        TreeSet<Integer> ob = new TreeSet<>();
        ob.add(10);
        ob.add(20);
        ob.add(5);
        ob.add(2);
        ob.add(40);
        ob.add(7);
        System.out.println(ob);
        for (Integer x : ob) {
            System.out.println(x);
        }
    }

}
