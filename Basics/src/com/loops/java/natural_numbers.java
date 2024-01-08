
//Print the sum of first n natural numbers | n = 4

package com.loops.java;

import java.util.*;

public class natural_numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
