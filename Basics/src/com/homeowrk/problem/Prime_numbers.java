//Print if a number is prime or not (Input n from the user). 

package com.homeowrk.problem;

import java.util.*;

public class Prime_numbers {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 2; i < n; i++) {
			int sum = n % i;
			
			if(sum != 0) {
				System.out.println("Not prime");
			}
		}
		
//		System.out.println("The number "+n+" is prime number");
	}

}
