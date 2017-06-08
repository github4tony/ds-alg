package com.firecodex.dsalg.node;

import com.firecodex.dsalg.adt.AbstractNode;

public class ListNode implements AbstractNode{
	private Object data;
	private ListNode next;
	
	public ListNode(Object data) {
		this.data = data;
		this.next = null;
	}

	public ListNode(Object data, ListNode next) {
		this.data = data;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public ListNode getNext() {
		return next;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}
	
}
