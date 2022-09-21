package TestClasses;

import ExampleForPrsctise.Palindrum;

public class PalindrumTest {

	public static void main(String[] args) {
		Palindrum object = new Palindrum();
		int val =object.Rverse();
		int rev =object.reverseNumber(val);
		object.display(rev, "Reverse of Number");
		boolean status= object.isPalindrome(val, rev);
		object.dispalyisPolindromeorNot(status);

	}

}
