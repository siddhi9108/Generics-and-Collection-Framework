package javaapplication2;

import java.util.*;

public class Iterator1 {

    public static void main(String[] args) {
        ArrayList<String> ob = new ArrayList<>();
        System.out.println(ob.size());
        System.out.println("===========================");
        ob.add("A");
        ob.add("B");
        ob.add("C");
        ob.add("D");
        Iterator<String> it = ob.iterator();
        while (it.hasNext()) {
            String n = it.next();
            System.out.println(n);
        }

    }
}
