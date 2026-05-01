package com.mypackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Vector;

public class List {
	public static void main(String[] args) {

//		ArrayList<Integer> lists = new ArrayList<Integer>();
//
//		lists.add(18);
//		lists.add(5);
//		lists.add(31);
//		lists.add(17);
//		lists.add(17);
//		lists.add(12);
//		lists.add(18);
//
//		System.out.println(lists);
//		System.out.println(lists.remove(2)); // remove 31 from list
//		System.out.println("After remove.. " + lists);
//		System.out.println(lists.set(3, 74));
//		System.out.println("After Update list.." + lists);
//
//		System.out.println("Size of List.. " + lists.size());
//		System.out.println("Fist element in list.. " + lists.get(0) + "\n");
//		System.out.println("Last Element in List.. " + lists.get(lists.size() - 1) + "\n");
//		System.out.println("Element 18 Exist." + lists.contains(18) + "\n");   // Check Element using Contains
//
//		System.out.println("Iterate Elements using foreach loop..");
//		for (Integer list : lists) {
//			System.out.println(list);
//		}
//		Collections.sort(lists); // sort list
//		System.out.println("Sorted List : " + lists);
//
//		// Remove Duplicates from List
//		System.out.println("Origional List : " + lists);
//		ArrayList<Integer> uniqueList = new ArrayList<Integer>();
//		for (Integer list : lists) {
//			if (!uniqueList.contains(list)) {
//				uniqueList.add(list);
//			}
//		}
//		System.out.println("After remove Duplicates: " + uniqueList);
//
//		// copied List
//		ArrayList<Integer> copiedList = new ArrayList<Integer>(uniqueList);
//
//		System.out.println("Copied  List: " + copiedList);
//
//		// convert list to Array
//		Integer[] arr = lists.toArray(new Integer[0]);
//		System.out.println("Array Elements:");
//		for (int num : arr) {
//			System.out.println(num);
//		}
//
//		ArrayList<String> list1 = new ArrayList<String>();
//		list1.add("Tanseem");
//		list1.add("Asma");
//		list1.add("Atik");
//		list1.add("Ashfaq");
//		list1.add("Tanseem");
//		list1.add("Tanseem");
//		list1.add("Atik");
//		System.out.println(list1);
//		System.out.println(list1.remove(2));
//		System.out.println("After remove.. " + list1);

		// HashSet
		HashSet<Integer> numbers = new HashSet<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40); // Duplicates, will not be stored
		numbers.add(40); // duplicate
		numbers.add(50);

		System.out.println("numbers in Hashset:");
		for (Integer num : numbers) {
			System.out.println(num);
		}

		// HashMap
		HashMap<Integer, String> Student = new HashMap<Integer, String>();
		System.out.println("\nStudent Details: ");
		Student.put(101, "Asma");
		Student.put(102, "Tanu");
		for (Integer id : Student.keySet()) {
			System.out.println("ID: " + id + " Name: " + Student.get(id));
		}

		// TreeSet
		TreeSet<Integer> number = new TreeSet<Integer>();
		number.add(50);
		number.add(99);
		number.add(100);
		number.add(23);
		System.out.println("\nSorted numbers using TreeSet: ");
		for (Integer num : number) {
			System.out.println(num);
		}
		System.out.println("\nSize of list:" + number.size());
		System.out.println("contains 100 :" + number.contains(100)); // Check Element using Contains

		number.clear(); // remove all elements
		System.out.println("List: " + number);
		System.out.println("Size: " + number.size());

	}
}
