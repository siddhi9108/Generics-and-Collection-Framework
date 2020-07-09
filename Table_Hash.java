package javaapplication2;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Table_Hash {

    public static void main(String[] args) {
        Hashtable<Integer, String> ob = new Hashtable<>();
        ob.put(10, "A");
        ob.put(20, "B");
        ob.put(30, "C");
        Set<Map.Entry<Integer, String>> kv = ob.entrySet();
        for (Map.Entry<Integer, String> entry : kv) {
            System.out.println(entry.getClass() + "," + entry.getValue());
        }

    }
}
