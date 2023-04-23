package com.greatlearning.dsa.sumpairofnodes;

import java.util.Set;

public class BinaryTreeSumPair {

	public  boolean findSumPair(TreeNode root,int sum,Set<Integer> value) {
		if(root==null) {
			return false;
		}
	if(findSumPair(root.left,sum,value)) {
		return true;
	}
	int reminder=sum-root.data;
	if(value.contains(reminder)) {
		System.out.println("The Pair("+root.data+","+reminder+") can form the given sum");
		return true;
	}
	else {
		value.add(root.data);
	}
	return findSumPair(root.right,sum,value);
		
	}

}

