package com.Map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapCode {
	public static void main(String[] args) {
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("name", "Tanu");
		map.put("name1", "Tanu"); // Duplicate values alllowed
		map.put("city", "Pune"); // Duplicate Kays are not allowed
		map.put("city", "Mumbai");
		// map.put(null, "Pune"); // in TreeSet key as null is not Allowed
		map.put("phoNo", null);
		map.put("panNo", null);
		System.out.println(map + "\n"); // TreeMap Follow sorting based on keys

		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println(map.containsValue("Tanu"));
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.remove("city"));
		System.out.println("After Remove City: " + map);
		System.out.println("After Sort in Descending Order: " + map.descendingKeySet()); // sort in descending order
	}
}
