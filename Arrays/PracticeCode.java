package com.mypackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PracticeCode {

	public static void main(String[] args) {

		// 1. program to print all elements of a 1D array.

//		int[] numbers = { 20, 8, 99, 87, 35 };
//		System.out.println(numbers[0]);
//		System.out.println(numbers[1]);
//		System.out.println(numbers[2]);
//		System.out.println(numbers[3]);
//		System.out.println(numbers[4]);

		// 2. program to declare and initialize a 1D array of integers
//		int[] numbers = new int[5];
//		numbers[0] = 24;
//		numbers[1] = 66;
//		numbers[2] = 28;
//		numbers[3] = 22;
//		numbers[4] = 4;
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}

		// 3. program to find the length of a 1D array.

//		String[] name = { "asma", "Tanu", "Priya", "Payal" };
//		System.out.println(name.length);

		// 4. program to find the sum of all elements in a 1D array.
//		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		System.out.println("Enter Numbers: ");
//		int[] numbers = new int[5];
//		for (int i = 0; i < numbers.length; i++) {
//			numbers[i] = sc.nextInt();
//			sum = sum + numbers[i];
//
//		}
//		System.out.println(sum);

		// 5. program to find the average of elements in a 1D array.
//		int[] numbers = { 20, 8, 99, 87, 35 };
//		int sum = 0;
//
//		for (int i = 0; i < numbers.length; i++) {
//			sum = sum + numbers[i];
//		}
//		double average = sum / numbers.length;
//		System.out.println("Average: " + average);

		// 6. program to find the maximum element in a 1D array.

//		int[] numbers = { 20, 8, 99, 87, 35 };
//		int max = numbers[0];
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] > max) {
//				max = numbers[i];
//			}
//		}
//		System.out.println("Maximum number: " + max);

		// 7.program to find the minimum element in a 1D array.

//		int[] numbers = { 20, 8, 99, 87, 35 };
//		int min = numbers[0];
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] < min) {
//				min = numbers[i];
//			}
//		}
//		System.out.println("Minimum number: " + min);

		// 8. program to search an element in a 1D array.

//		int[] numbers = { 20, 8, 99, 87, 35 };
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number for search..");
//		int search = sc.nextInt();
//		boolean found = false;
//		for (int i = 0; i < numbers.length; i++) {
//
//			if (numbers[i] == search) {
//				found = true;
//				break;
//			}
//		}
//		if (found) {
//			System.out.println("Number is found..");
//		} else {
//			System.out.println("Number is not found..");
//		}

		// 9. program to count even and odd numbers in a 1D array.
//		int[] numbers = { 20, 8, 99, 87, 35 };
//		int odd = 0;
//		int even = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			if (numbers[i] % 2 == 0) {
//				even++;
//			} else {
//				odd++;
//			}
//		}
//		System.out.println("Even count : " + even);
//		System.out.println("Odd count : " + odd);

		// 10. program to copy elements from one array to another.

//		int[] arr1 = { 20, 8, 99, 87, 35 };
//		int[] copy = new int[arr1.length];
//		for (int i = 0; i < arr1.length; i++) {
//			copy[i] = arr1[i];
//		}
//		System.out.println("Copied Elements..");
//		for (int i = 0; i < copy.length; i++) {
//			System.out.println(copy[i]);
//		}

		// 11. program to reverse a 1D array.

//		int[] arr1 = { 20, 8, 99, 87, 35 };
//		for (int i = arr1.length-1; i > 0; i--) {
//			System.out.println("Reverse array: "+arr1[i]);
//		}

		// 12. program to sort a 1D array in ascending order.

//		String[] name = { "Asma", "Tanu", "Priya", "Payal" };
//		Arrays.sort(name);
//		System.out.println("Ascending Order.. ");
//		for (int i = 0; i < name.length; i++) {
//			System.out.println(name[i]);
//		}

		// 13. program to sort a 1D array in descending order.
//		String[] name = { "Asma", "Tanu", "Priya", "Payal" };
//		Arrays.sort(name, Collections.reverseOrder());
//		System.out.println("Descending order..");
//		for (int i = 0; i < name.length; i++) {
//			System.out.println(name[i]);
//		}

		// 14.program to find duplicate elements in a 1D array.

//		int[] arr1 = { 20, 8,35, 99, 87, 35 };
//		System.out.println("Duplicate Elemnets are..");
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = i + 1; j < arr1.length; j++) {
//				if (arr1[i] == arr1[j]) {
//					System.out.println(arr1[i]);
//					break;
//				}
//			}
//		}

		// 15. program to remove duplicate elements from a 1D array.
//		int[] arr1 = { 20, 8, 35, 99, 87, 35 };
//		System.out.println("Array after Removing Duplicate Elemnets..");
//		for (int i = 0; i < arr1.length; i++) {
//			int j;
//			for (j = 0; j < i; j++) {
//				if (arr1[i] == arr1[j]) {
//					break;
//				}
//			}
//			if (j == i) {
//				System.out.println(arr1[i] + " ");
//			}
//		}

		// 16. program to count frequency of each elements in a 1D array.
//		int[] arr = { 2, 4, 3, 2, 4, 5, 3, 4, 5, 5 };
//		int n = arr.length;
//		boolean[] visited = new boolean[n];
//		for (int i = 0; i < n; i++) {
//			if (visited[i] == true) {
//				continue;
//			}
//			int count = 1;
//			for (int j = i + 1; j < n; j++) {
//				if (arr[i] == arr[j]) {
//					count++;
//					visited[j] = true;
//				}
//			}
//			System.out.println(arr[i] + " occurs " + count + " times");
//		}

		// 17.program to find second largest elements in a 1D array.
//
//		int arr[] = { 20, 30, 77, 39 };
//		int largest = arr[0];
//		int secondLargest = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > largest) {
//				secondLargest = largest;
//				largest = arr[i];
//			} else if (arr[i] > secondLargest && arr[i] != largest) {
//				secondLargest = arr[i];
//			}
//		}
//		System.out.println("Second Largest = " + secondLargest);

		// 18.program to find second smallest elements in a 1D array.

//		int arr[] = { 20, 30, 77, 39 };
//		int smallest = arr[0];
//		int secondSmallest = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] < smallest) {
//				secondSmallest = smallest;
//				smallest = arr[i];
//			} else if (arr[i] < secondSmallest && arr[i] != smallest) {
//				secondSmallest = arr[i];
//			}
//		}
//		System.out.println("Second Smallest = " + secondSmallest);

//		// 19.program to merge two 1D array.
//		int arr1[] = { 20, 30, 77, 39 };
//		int arr2[] = { 10, 3, 17, 18 };
//		int merge[] = new int[arr1.length + arr2.length];
//		for (int i = 0; i < arr1.length; i++) {
//			merge[i] = arr1[i];
//		}
//		for (int i = 0; i < arr2.length; i++) {
//			merge[arr1.length + i] = arr2[i];
//		}
//		System.out.println("Merged Array..");
//		for (int i = 0; i < merge.length; i++) {
//			System.out.println(merge[i] + " ");
//		}

		// 20.program to check whether 1D array is a Palindrom.
		int arr[] = { 20, 30, 77, 39 };
		int rev[] = new int[arr.length];

		// reverse array
		for (int i = 0; i < arr.length; i++) {
			rev[i] = arr[arr.length - 1 - i];
		}
		// compare both arrays
		boolean isPalindrome = true;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != rev[i]) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("Array is Palindrome. ");
		} else {
			System.out.println("Array is not Palindrome. ");
		}
	}
}