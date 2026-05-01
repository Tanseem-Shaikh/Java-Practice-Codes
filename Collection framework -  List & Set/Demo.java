package com.mypackage;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Demo {
	public static void main(String[] args) {
		// ArrayList
//	ArrayList list=new ArrayList();
//	list.add(3673676);
//	list.add("Tanseem");
//	list.add(23.8);
//	list.add(null);
//	list.add(false);
//	list.add(null);
//	list.add(true);
//	list.add(2);
//	System.out.println(list);

//	ArrayList<Integer> list=new ArrayList<Integer>();  
//	list.add(36);
//	list.add(1);
//	list.add(2);
//	list.add(20);
//	list.add(8);
//	list.add(6);
//	list.add(27);
//	list.add(2);
		// System.out.println(list);
//	ArrayList<Integer> list1=new ArrayList<Integer>();
//	list1.add(36);
//	list1.add(1);
//	list1.add(20);
//	list1.add(8);
//	list1.add(6);
//	list1.add(27);
//	list1.add(2);
		// System.out.println(list1);
//	System.out.println(list.addAll(list1));
//	System.out.println(list.isEmpty());
//	System.out.println(list.remove(1));
//	System.out.println(list);
//	

		// Linked List

		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(36);
		list.add(11);
		list.add(20);
		list.add(89);
		list.add(18);
		list.add(26);
		list.add(27);
		list.add(20);

		//Vector
		Vector<String> list1 = new Vector<String>();
		list1.add("Tanseem");
		list1.add("Asma");
		list1.add("Atik");
		list1.add("Ashfaq");
		list1.add("Tanseem");
		list1.add("Tanseem");
		list1.add("Atik");
		System.out.println(list1);
		
	}
}
