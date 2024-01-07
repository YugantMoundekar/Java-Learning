package com.homeowrk.problem;

import java.util.*;

public class basic_calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int z = 1;
		
		//while(z >= 100) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int num = sc.nextInt();
		
		
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int mod = a%b;
		
		switch(num) {
		case 1: System.out.println("Addition = "+ add);
		break;
		case 2: System.out.println("Substraction = "+ sub);
		break;
		case 3: System.out.println("MMultiplication = "+ mul);
		break;
		case 4: System.out.println("Division = "+ div);
		break;
		case 5: System.out.println("Modulous = "+ mod);
		break;
		default: System.out.println("Invalid");
		}
		
		//}

	}

}
