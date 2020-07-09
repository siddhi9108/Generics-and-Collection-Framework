package javaapplication2;

import java.util.Properties;
import java.util.Set;

public class legacyClass_Property2 {

    public static void main(String[] args) {
        Properties p = System.getProperties();
        System.out.println(p.get("os.name"));
        Set<Object> keys = p.keySet();
        for (Object key : keys) {
            System.out.println(key);
        }
    }
}
