package com.kames.ds.algo.recursion;

// x^n = x * x^n-1
// 2^ 4 = 2 * 2 * 2 * 2
public class PowerOf {
	public int power(int base, int exponent) {
		if (exponent < 0) {
			return -1;
		}
		if (exponent == 0) {
			return 1;
		}
		if (exponent == 1) {
			return base;
		}
		return base * power(base, (exponent - 1));
	}
}