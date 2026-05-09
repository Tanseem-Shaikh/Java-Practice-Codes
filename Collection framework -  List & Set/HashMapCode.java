package com.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapCode {
	public static void main(String[] args) {

		// HashMap
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Tanseem");
		m.put(5, "Tanseem"); // duplicates value are allowed
		m.put(2, "Priya");
		m.put(3, "Asma");
		m.put(4, "Atik");
		m.put(null, "Atik"); // only one null key is allowed
		m.put(4, null);
		m.put(4, null); // duplicate keys are not allowed
		m.put(4, null);
		m.put(3, null);

		System.out.println(m); // HashMap does not Follow the insertion order

		for (Map.Entry<Integer, String> entry : m.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println("\n" + m.get(2));
		System.out.println(m.isEmpty());
		System.out.println(m.containsValue(null));
		System.out.println(m.containsKey(6));
		System.out.println(m.remove(4));
		System.out.println("After Remove key: " + m);
		System.out.println(m.size());
		System.out.println(m.remove(3, "Asma"));
		System.out.println("After remove key+value: " + m);
		System.out.println(m.replace(1, "Zoya"));
		System.out.println("After Replace Tanseem-->Zoya " + m);
		System.out.println(m.replace(2, "Priya", "Mahi"));
		System.out.println("After Replace old value to new value--Priya to Mahi " + m);

	}
}
