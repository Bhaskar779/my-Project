package SampleClasses;

import java.util.Scanner;

public class Calculator {
	private Scanner scan;
	private int a,b;
	private char operator;
	
	public Calculator() {
		
		scan = new Scanner(System.in);
	}
	
	public void scanABValues() {
		
		System.out.println("Enter a, b Values  ");
	    a = scan.nextInt();
	    b = scan.nextInt();
		
	}
	public void scanOperator() {
		System.out.println("Enter the operator: \n+ ADD\n- SUB\n* MUL\n % MOD");
		operator =scan.next().charAt(0);
	}
	public void calculatorIf() {
		this.scanABValues();
		this.scanOperator();
		if(operator == '+')
			System.out.println("Sum = "+(a+b));
		else if(operator == '-')
		System.out.println("Sub = "+(a-b));
		else if(operator == '*')
			System.out.println("Mul = "+(a*b));
		else if(operator == '%')
			System.out.println("Mod = "+(a%b));
		else
			System.out.println("Invalid Operator");
	}
	public void calculatorSwitch() {
		this.scanABValues();
		this.scanOperator();
		switch(operator) {
		default:System.out.println("Invalid Operator");
		break;
		case'+':System.out.println("Sum = "+(a+b));
		break;
		case'-':
			System.out.println("Sub = "+(a-b));
			break;
		case'*':
			System.out.println("Mul = "+(a*b));
			break;
		case'%':System.out.println("Mod = "+(a%b));
		}
	}
	
}
