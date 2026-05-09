package com.Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapCode {
	public static void main(String[] args) {

		// LinkedHashMap Follow the insertion order

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(10, "naira"); // duplicate valu allowed
		map.put(10, "naira"); // Duplicate key not allowed
		map.put(11, "naira");
		map.put(2, "Maya");
		map.put(2, "Maya");
		map.put(4, "Ruhi");
		map.put(15, "Hania");
		map.put(null, "Saima"); // key as a null allowed
		map.put(9, null); // value as null Allowed
		map.put(3, null);

		System.out.println(map + "\n");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		System.out.println(map.containsValue("Ruhi"));
		System.out.println(map.containsKey(2));
		System.out.println("Before Remove: " + map);
		System.out.println(map.remove(15));
		System.out.println("After Remove: " + map);
		System.out.println(map.isEmpty());
		System.out.println(map.get(4));
		System.out.println("Before Replacement:" + map);
		System.out.println(map.replace(10, "Piya"));
		System.out.println("After Replacement: " + map);
	}
}
