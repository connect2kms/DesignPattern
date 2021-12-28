package com.kames.ds.algo.recursion;

public class Fibonaci {

	public int fib(int n) {
		
		// f(n) = f(n-1) + f(n-2)
		// f(5) = 0 + 1 + 1 + 2 + 3 + 5
		
		
	    if (n<0) 
	        return -1;
	    
		if(n==0 || n== 1)
			return n;
		
		return fib(n-1) + fib(n-2);
	}

}
