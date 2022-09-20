package ExampleForPrsctise;

import java.util.Scanner;

public class FibnocciSereis {
	private Scanner scan; 
	int n3,n1=2,n2=3,i,count;
	public FibnocciSereis() {
		scan = new Scanner(System.in);
	}
//	public int  ScanNumbers(int n1, int n2) {
//		return n1 = scan.nextInt();
//		return n2 = scan.nextInt();	
//	}
	public int ScanCount(int count) {
		return count = scan.nextInt();
	}
	public void Fibnoccisereis() {
		int count =10;
		for (int i =2;i<count;++i) {
			int n3 =n1+n2;
			System.out.println("print next Number: "+n3);
			n1 =n2;
			n2 = n3;
		}
		
	}
}
