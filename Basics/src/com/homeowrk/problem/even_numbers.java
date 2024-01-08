//Print all even numbers till n

package com.homeowrk.problem;

import java.util.*;

public class even_numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
//		int result = 0;
		
		for(int i = 1; i <= n; i++) {
			
			if(i%2 == 0) {
				System.out.println(i);
			}
			
		}

	}

}
// Done