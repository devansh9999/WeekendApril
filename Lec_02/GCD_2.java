package Lec_02;

import java.util.Scanner;

public class GCD_2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int divisor = a;
		int dividend = b;
		while (divisor>0) {
			int rem = dividend % divisor;
			dividend = divisor;
			divisor = rem;
		}
		System.out.println(dividend);
	}
}
