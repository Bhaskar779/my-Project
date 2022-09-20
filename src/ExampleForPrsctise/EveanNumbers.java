package ExampleForPrsctise;

import java.util.Scanner;

public class EveanNumbers {
	private Scanner scan;
	private int sum,count;
	public EveanNumbers() {
		scan = new Scanner(System.in);
	}
	public int scanLowerLimit() {
		System.out.println("Enter Lower Limit: ");
		int lw= scan.nextInt();
		return lw;
	}
	public int scanUpperLimit() {
		System.out.println("Enter Upper Limit: ");
		int ul= scan.nextInt();
		return ul;
	}
	public void displayEvenNumbers(int lw, int ul) {
		 sum = 0;
		 count = 0;
		for(int i= lw;i<ul; i++) {
			int rem = i%2;
			if (rem == 0)
			{
				System.out.println(i+" ");
				sum = sum+i;
				count++;
			}
		}
	}
	public void displaysum() {
		System.out.println("Sum Of Even Numbers = "+sum);
	}
	public void displaycount() {
		System.out.println("Total number of even nubers in the given range is : "+count);
	}
}
