package com.firecodex.dsalg.node;

import com.firecodex.dsalg.adt.AbstractNode;

public class DoublyListNode implements AbstractNode{
	private Object data;
	private DoublyListNode prev;
	private DoublyListNode next;
	
	public DoublyListNode(Object data){
		this.data = data;
		this.prev = null;
		this.next = null;
	}

	public DoublyListNode(Object data, DoublyListNode prev) {
		this.data = data;
		this.prev = prev;
		this.next = null;
	}

	public DoublyListNode(Object data, DoublyListNode prev, DoublyListNode next) {
		this.data = data;
		this.prev = prev;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public DoublyListNode getPrev() {
		return prev;
	}

	public void setPrev(DoublyListNode prev) {
		this.prev = prev;
	}

	public DoublyListNode getNext() {
		return next;
	}

	public void setNext(DoublyListNode next) {
		this.next = next;
	}
	
}
