package com.firecodex.dsalg.impl.list;

import com.firecodex.dsalg.adt.AbstractList;
import com.firecodex.dsalg.adt.AbstractNode;
import com.firecodex.dsalg.node.ListNode;

public class LinkedList implements AbstractList{
	private ListNode head;
	private int length;
	
	public LinkedList() {
		this.length = 0;
	}
	public LinkedList(Object data) {
		this.head =new ListNode(data);
		this.length = 1;
	}
	
	public ListNode get(int index){
		if(length==0 || index<1){
			return null;
		}else{
			ListNode node = head;
			int count = 1;
			while(count<index && node.getNext()!=null){
				node = node.getNext();
				count++;
			}
			return count==index ?node :null;
		}
	}
	
	public void insert(Object data){
		if(length==0){
			head =new ListNode(data);
		}else{
			ListNode node = head;
			while(node.getNext()!=null){
				node = node.getNext();
			}
			ListNode tail =new ListNode(data);
			node.setNext(tail);
		}
		length++;
	}
	public void insert(Object data, int index){
		ListNode node = head;
		if(index==0){
			head =new ListNode(data);
			head.setNext(node);
		}else{
			int count = 1;
			while(count<index && node.getNext()!=null){
				node = node.getNext();
				count++;
			}
			ListNode temp =new ListNode(data);
			temp.setNext(node.getNext());
			node.setNext(temp);
		}
		length++;
	}
	
	public void remove(int index){
		if(length<1) return;
		if(index<0){
			ListNode node = head;
			int count = 1;
			while(count<length-1){
				node = node.getNext();
				count++;
			}
			node.setNext(null);
		}else if(index==0){
			head = head.getNext();
		}else{
			int count = 1;
			ListNode node = head;
			ListNode prev = head;
			while(count<index && node.getNext()!=null){
				prev = node;
				node = node.getNext();
				count++;
			}
			prev.setNext(node.getNext());
		}
		length--;
	}
	public void remove(Object data){
		if(length<1) return;
		ListNode node = head;
		while(node.getNext()!=null){
			if(node.getNext().getData().equals(data)){
				ListNode temp = node.getNext().getNext();
				node.setNext(temp);
				length--;
				return;
			}
			node = node.getNext();
		}
		if(node.getData().equals(data)){
			this.remove(-1);
		}
	}
	
	public void print(){
		if(head==null) return;
		System.out.println("Linked List:");
		ListNode lastNode = head;
		while(lastNode.getNext()!=null){
			System.out.println(lastNode.getData());
			lastNode = lastNode.getNext();
		}
		System.out.println(lastNode.getData());
		System.out.println("Total: "+length);
	}

	public AbstractNode head() {
		return head;
	}
	
	public int size() {
		return length;
	}
	public void removeAll() {
		// TODO Auto-generated method stub
		
	}
}
