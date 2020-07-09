package javaapplication2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_Hash {

    public static void main(String[] args) {
        HashMap<Integer, String> ob = new HashMap<>();
        ob.put(10, "A");
        ob.put(20, "B");
        ob.put(30, "C");
        ob.put(40, "D");
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
