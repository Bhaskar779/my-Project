package ExampleForPrsctise;

public class Palindrum {
	private int rev;
	public int Rverse() {
	EveanNumbers num = new EveanNumbers();
	num.displayEvenNumbers(5, 50);
	int val =num.displaysum();
	return val;
}
	public int reverseNumber(int val) {
		rev = 0;
		while (val>0) {
			int rem = val%10;
			rev =rev*10+rem;
			val = val/10;
		}
		return rev;
	}
	public void display(int value) {
		System.out.println(value);
	}
	public void display(int value, String typeOfValue) {
		System.out.println(typeOfValue+"   "+value);
	}
	public boolean isPalindrome(int val, int rev) {
		return val == rev;
	}
	public void dispalyisPolindromeorNot(boolean status) {
		if(status)
	System.out.println("Palindrome");
		else
			System.out.println("not a Palindrome");
}
}