package com.firecodex.dsalg.adt;

public interface AbstractQueue {
	public void enqueue(Object data);
	public Object dequeue();
	public Object front();
	public int size();
	public boolean isEmpty();
	public boolean isFull();

}
