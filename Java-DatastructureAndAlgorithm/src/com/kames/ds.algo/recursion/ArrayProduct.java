package com.kames.ds.algo.recursion;

public class ArrayProduct {

	public static void main(String[] args) {
		ArrayProduct ap = new ArrayProduct();
		
		int A[] = {1, 2, 3, 4, 5};
		
		System.out.println(ap.productofArray(A, A.length));
		
	}

    public int productofArray(int A[], int N) 
    { 
        if (N <= 0) 
            return 1; 
        
        return (A[N - 1] * productofArray(A, N - 1)); 
        
        // pa(a,4) * 5
        // pa(a,3) * 4
        // pa(a,2) * 3
        // pa(a,1) * 2
        // pa(1,0) * 1
    
    } 
    
}
