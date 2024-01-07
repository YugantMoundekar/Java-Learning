package com.conditional.statements;
import java.util.*;
public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println("The number "+num+" is Even number.");
		}
		else
		{
			System.out.println("The number "+num+" is Odd number.");
		}
	}

}
