package javaapplication2;

import java.util.*;
public class ArrayListClass
{
	public static void main(String[] args) {
		ArrayList<String> ob = new ArrayList<>();
		System.out.println(ob.size());
		System.out.println("===========================");
		ob.add("A");
		ob.add("B");
		ob.add("C");
		ob.add("D");
		System.out.println(ob.size());
		System.out.println("===========================");
		ob.remove("C");
		System.out.println(ob.size());
	}
}