package com.firecodex.dsalg.impl.stack;

import com.firecodex.dsalg.adt.AbstractStack;

public class ArrayStack implements AbstractStack{
	private Object[] stack;
	
	public ArrayStack(int limit) {
		stack =new Object[limit];
	}

	public void push(Object data) {
		// TODO Auto-generated method stub
		
	}

	public Object pop() {
		// TODO Auto-generated method stub
		return null;
	}

	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Object top() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

}
