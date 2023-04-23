package com.greatlearning.dsa.sumpairofnodes;


import java.util.HashSet;

import java.util.Scanner;
import java.util.Set;

public class Driver {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeNode root=new TreeNode(40);
		root.insertNode(root, 20);
		root.insertNode(root, 60);
		root.insertNode(root, 10);
		root.insertNode(root, 30);
		root.insertNode(root, 50);
		root.insertNode(root, 70);
		BinaryTreeSumPair obj=new BinaryTreeSumPair();
		System.out.println("Enter the target sum");
		int sum=sc.nextInt();
		Set<Integer> value=new HashSet<Integer>();
	    if(!obj.findSumPair(root,sum,value)) {
	    	System.out.println(" Nodes are not found for the given sum");
	    }
	    
	    sc.close();
	}
    
    
}


