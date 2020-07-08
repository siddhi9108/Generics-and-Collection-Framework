package javaapplication2;

import java.util.LinkedList;

public class Linked_List_1 {

    public static void main(String[] args) {

        LinkedList<Integer> ob = new LinkedList();

        ob.add(10);
        ob.add(20);
        ob.add(30);
        System.out.println(ob);
        ob.addFirst(40);
        ob.addLast(50);
        System.out.println(ob);
        System.out.println(ob.getFirst());
        System.out.println(ob.getLast());
        ob.removeFirst();
        System.out.println(ob);
        ob.removeLast();
        System.out.println(ob);
        for(Integer x:ob){
            System.out.println(ob);
        }

    }

}
