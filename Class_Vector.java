package javaapplication2;

import java.util.Enumeration;
import java.util.Vector;

public class Class_Vector {

    public static void main(String[] args) {
        Vector<String> ob = new Vector<>();
        ob.addElement("A");
        ob.addElement("B");
        ob.addElement("C");
        ob.addElement("D");
        ob.add("E");
        Enumeration<String> it = ob.elements();
        while (it.hasMoreElements()) {
            String n = it.nextElement();
            System.out.println(n);
        }
        System.out.println("========================");
        for (String s : ob) {
            System.out.println(s);
        }
    }
}
