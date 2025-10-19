package more_generics;

public class PalindromeProperty implements SpecificProperty<String> {
	public boolean test(String obj) {

		StringBuilder reverseBuilder = new StringBuilder();
		int l = obj.length();

		for (int i = l - 1; i >= 0; i--)
			reverseBuilder.append(obj.charAt(i));

		// System.out.println(reverse);
		return obj.equals(reverseBuilder.toString());
	}
}
