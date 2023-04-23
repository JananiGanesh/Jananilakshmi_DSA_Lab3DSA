package com.greatlearning.dsa.sumpairofnodes;

public class TreeNode {

	
		int data;
		TreeNode left,right;
		public TreeNode(int data) {
			
			this.data = data;
			this.left=null;
			this.right=null;
		}
		public TreeNode insertNode(TreeNode root,int data) {
			if(root==null) {
				return new TreeNode(data);	
			}
			if(data<root.data) {
				root.left=insertNode(root.left,data);
			}
			else if(data>root.data) {
				root.right=insertNode(root.right,data);
			}
			else
				System.out.println("Given data is already present");
			
			return root;
		}
	}

