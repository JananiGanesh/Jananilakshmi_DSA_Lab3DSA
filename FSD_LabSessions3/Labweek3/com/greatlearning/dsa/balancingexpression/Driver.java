package com.greatlearning.dsa.balancingexpression;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		BalancingBrackets obj=new BalancingBrackets();
		
		if(obj.isBalanced(S)) {
			System.out.println("Brackets are balanced");
		}
		else
			System.out.println("Brackets are not balanced");
		
		sc.close();
	}

	
}
