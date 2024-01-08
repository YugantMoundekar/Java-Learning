package com.basics.java;

import java.util.*;

public class sum {
	
	public static void main (String[]args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		double sum = a+b;
		
		System.out.println(sum);
		
	}

}
