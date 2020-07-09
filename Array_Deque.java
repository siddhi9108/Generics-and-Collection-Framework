package javaapplication2;

import java.util.ArrayDeque;

public class Array_Deque {

    public static void main(String[] args) {
        ArrayDeque<Integer> ob = new ArrayDeque<>();
        ob.push(10);
        ob.push(20);
        ob.push(30);
        while (ob.peek() != null) {
            System.out.println("Poped items" + ob.pop());
        }
    }
}
