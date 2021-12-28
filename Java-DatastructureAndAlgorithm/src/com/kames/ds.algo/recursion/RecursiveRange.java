package com.kames.ds.algo.recursion;

public class RecursiveRange {

	public int recursiveRange(int num) {

		// 6 = 6 + 5 + 4 + 3 + 2 + 1 + 0
		// f(n) = n + f(n-1)

		if (num == 1)
			return 1;

		return num + recursiveRange(num - 1);
	}

}