package javaapplication2;

import java.util.Properties;
import java.util.Set;

public class legacyClass_Property1 {

    public static void main(String[] args) {
        Properties p = System.getProperties();
        Set<Object> keys = p.keySet();
        for (Object key : keys) {
            System.out.println(key);
        }
    }
}
