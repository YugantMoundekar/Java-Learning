/*  
 * 
 * Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
If they enter 0 then stop.
If he/ she scores :

Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”

	Because marks don’t matter but our effort does.
(Hint : use do-while loop but think & understand why)


*/

package com.homeowrk.problem;

import java.util.*;

public class Students_marks {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input;
		
		do {
			int marks = sc.nextInt();
			if(marks >= 90) {
				System.out.println("This is Good");
			} else if (89 >= marks && marks >= 60) {
				System.out.println("This is also Good");
			}else if(59 >= marks && marks >= 0) {
				System.out.println("This is Good as well");
			} else {
				System.out.println("Invalid Marks");
			}
			
			System.out.println("Want ot continue ? Yes = 1 , No = 0");
			input = sc.nextInt();
			
		}while(input == 1);
		
		
	}

}
