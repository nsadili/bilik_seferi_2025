package more_generics;

import java.util.*;

public class UtilityTest {
	public static void main(String[] args) {
		Collection<Integer> integers = Arrays.asList(12, 14, 17, 20, 25);
		int count = Utility.countIf(integers, new EvenProperty());
		System.out.println("Number of even integers = " + count); // 3

		Collection<String> words = Arrays.asList("apple", "anna", "bob", "alice");
		count = Utility.countIf(words, new PalindromeProperty());
		System.out.println("Number of palindromes = " + count); // 2

	}
}
