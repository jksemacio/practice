package com.jksemacio;

public class Application {

	public static void main(String[] args) {
		int [] a = {3,2,4,6,7,5,1,2,1,5};
		int [] b = {1,2,2,2,2,1};
		int [] c = {1,1,2,2,2,1};
		
		
		sort(a);
		
		for(int i=0; i < a.length; i++) {
			System.out.print("[" + a[i] + "]");
		}
		System.out.println();
		
		for(int i=0; i < b.length; i++) {
			System.out.print("[" + b[i] + "]");
		}
		
		if(isPalindrome(b)) {
			
			System.out.println(" is Palindrome");
		} else {
			System.out.println(" is not Palindrome");
		}
		
		for(int i=0; i < c.length; i++) {
			System.out.print("[" + c[i] + "]");
		}
		
		if(isPalindrome(c)) {
			System.out.println(" is Palindrome");
		} else {
			System.out.println(" is not Palindrome");
		}
		
		System.out.println("Output:");
		drawX(9);
		System.out.println("Output:");
		drawY(9);
		System.out.println("Output:");
		drawZ(9);
	}
	
	public static void sort(int [] a) {
		int ptr;
		for(int i=0; i < a.length; i++) {
			ptr = i;
			for(int j=i+1; j < a.length; j++) {
				if(a[ptr] > a[j]) {
					ptr = j; 
				}
			}
			
			int tmp;
			tmp = a[i];
			a[i] = a[ptr];
			a[ptr] = tmp;
		}
	}
	
	public static boolean isPalindrome(int [] a) {
		int j = a.length-1;
		for(int i=0; i < a.length/2; i++) {
			if(a[i] != a[j]) {
				return false;
			}
			j--;
		}
		return true;
	}
	
	public static void drawX(int n) {
		int r = n-1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j || r==j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}	
			}
			System.out.println();
			r--;
		}
	}
	
	public static void drawY(int n) {
		int r = n-1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==j && i<=n/2 || r==j && i<=n/2) {
					System.out.print("*");
				} else if(j==n/2 && i>n/2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}	
			}
			System.out.println();
			r--;
		}
	}
	
	public static void drawZ(int n) {
		int r = n-1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i==0 || i==n-1) {
					System.out.print("*");
				} else if(r==j) { 
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}	
			}
			System.out.println();
			r--;
		}
	}
	
}
