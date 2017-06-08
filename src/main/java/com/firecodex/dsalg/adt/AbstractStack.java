package com.firecodex.dsalg.adt;

public interface AbstractStack {
	public void push(Object data);
	public Object pop();
	public Object top();
	public int size();
	public boolean isEmpty();
	public boolean isFull();
	
}
