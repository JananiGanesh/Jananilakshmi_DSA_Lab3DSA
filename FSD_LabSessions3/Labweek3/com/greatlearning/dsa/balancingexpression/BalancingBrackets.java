package com.greatlearning.dsa.balancingexpression;

import java.util.Deque;
import java.util.LinkedList;


public class BalancingBrackets {

	public boolean isBalanced(String S) {
		Deque<Character> deque = new LinkedList<>();
		for (char ch: S.toCharArray()) {
		    if (ch == '{' || ch == '[' || ch == '(') {
		        deque.addFirst(ch);
		    } else {
		        if (!deque.isEmpty()
		            && ((deque.peekFirst() == '{' && ch == '}')
		            || (deque.peekFirst() == '[' && ch == ']')
		            || (deque.peekFirst() == '(' && ch == ')'))) {
		            deque.removeFirst();
		        } else {
		            return false;
		        }
		    }
		}
		return deque.isEmpty();
	}
}


