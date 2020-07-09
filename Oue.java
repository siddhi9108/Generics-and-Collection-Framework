package javaapplication2;

import java.util.ArrayDeque;

public class Oue {

    public static void main(String[] args) {
        ArrayDeque<Integer> ob = new ArrayDeque<>();
        ob.addLast(10);
        ob.addLast(20);
        ob.addLast(30);
        ob.addLast(40);
        System.out.println(ob.removeFirst());
        System.out.println(ob);
    }
}
