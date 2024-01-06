package com.homeowrk.problem;

import java.util.*;

public class printTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int tableNumber = sc.nextInt();
		int i;
		for (i = 1; i <= 10; i++) {
			int count = tableNumber * i;
			System.out.println(count);
		}

	}

}
