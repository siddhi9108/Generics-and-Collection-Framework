package javaapplication2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeSet {

    public static void main(String[] args) {
        TreeMap<Integer, String> ob = new TreeMap<>();
        ob.put(200, "A");
        ob.put(300, "B");
        ob.put(100, "C");
        ob.put(400, "D");
        System.out.println(ob);
        System.err.println("Keys....");
        Set<Integer> keys = ob.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }
        System.err.println("Values....");
        Collection<String> values = ob.values();
        for (String value : values) {
            System.out.println(value);
        }
        System.out.println("keys and Values");
        Set<Map.Entry<Integer, String>> kv = ob.entrySet();
        for (Map.Entry<Integer, String> entry : kv) {
            System.err.println(entry.getKey() + "," + entry.getValue());
        }
    }
}
