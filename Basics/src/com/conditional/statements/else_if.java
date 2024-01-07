//In this question we have to put 3 conditions by taking 2 values in input

package com.conditional.statements;

import java.util.*;

public class else_if {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a == b) {
			System.out.println("Both are equal");
		} else if(a > b) {
			System.out.println("A is Greater");
		} else {
			System.out.println("B is greater");
		}
	}

}
