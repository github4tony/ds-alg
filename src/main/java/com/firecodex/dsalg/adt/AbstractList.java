package com.firecodex.dsalg.adt;

public interface AbstractList {
	public AbstractNode get(int index);
	public void insert(Object data);
	public void insert(Object data, int index);
	public void remove(Object data);
	public void remove(int index);
	public void removeAll();
	public AbstractNode head();
	public int size();
}
