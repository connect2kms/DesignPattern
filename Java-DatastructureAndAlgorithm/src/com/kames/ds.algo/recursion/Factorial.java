package com.kames.ds.algo.recursion;

// f(n)! = n * f(n-1)!
// f(4) = 4 * 3 * 2 * 1 
public class Factorial {
	public static void main(String[] args) {
		Factorial recursion = new Factorial();
		var rec = recursion.factorial(5);
		System.out.println(rec);
	}

	public int factorial(int n) {
		if (n < 1) {
			return -1;
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
