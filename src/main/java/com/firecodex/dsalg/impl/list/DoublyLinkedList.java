package com.firecodex.dsalg.impl.list;

import com.firecodex.dsalg.adt.AbstractList;
import com.firecodex.dsalg.node.DoublyListNode;

public class DoublyLinkedList implements AbstractList{
	private int length;
	private DoublyListNode head;
	
	public DoublyLinkedList() {
		this.length = 0;
	}
	public DoublyLinkedList(Object data) {
		this.head =new DoublyListNode(data);
		this.length = 1;
	}
	
	public DoublyListNode get(int index){
		if(length==0 || index<1) return null;
		DoublyListNode node = head;
		int count = 1;
		while(count<index && node.getNext()!=null){
			node = node.getNext();
			count++;
		}
		return count==index ?node :null;
	}
	
	public void insert(Object data){
		if(length==0){
			head =new DoublyListNode(data);
		}else{
			DoublyListNode node = head;
			while(node.getNext()!=null){
				node = node.getNext();
			}
			DoublyListNode tail =new DoublyListNode(data);
			tail.setPrev(node);
			node.setNext(tail);
		}
		length++;
	}
	public void insert(Object data, int index){
		if(length==0){
			head =new DoublyListNode(data);
		}else if(index<0){
			DoublyListNode node = head;
			while(node.getNext()!=null){
				node = node.getNext();
			}
			DoublyListNode tail =new DoublyListNode(data);
			tail.setPrev(node);
			node.setNext(tail);
		}else if(index==0){
			DoublyListNode temp = head;
			head =new DoublyListNode(data, null, temp);
		}else{
			DoublyListNode node = head;
			int count = 1;
			while(count<index && node.getNext()!=null){
				node = node.getNext();
				count++;
			}
			DoublyListNode tail =new DoublyListNode(data);
			tail.setNext(node.getNext());
			tail.setPrev(node);
			node.setNext(tail);
		}
		length++;
	}
	
	public void remove(int index){
		if(length==0) return;
		if(index<0){
			DoublyListNode node = head;
			while(node.getNext()!=null){
				node = node.getNext();
			}
			node.getPrev().setNext(null);
		}else if(index==0){
			head = head.getNext();
			head.setPrev(null);
		}else{
			DoublyListNode node = head;
			int count = 1;
			while(count<index && node.getNext()!=null){
				node = node.getNext();
				count++;
			}
			node.getPrev().setNext(node.getNext());
			node.getNext().setPrev(node.getPrev());
		}
		length--;
	}
	public void remove(Object data){
		if(length==0) return;
		DoublyListNode node = head;
		while(node.getNext()!=null){
			if(node.getData().equals(data)){
				node.getPrev().setNext(node.getNext());
				node.getNext().setPrev(node.getPrev());
				length--;
				return;
			}
			node = node.getNext();
		}
		if(node.getData().equals(data)){
			node.getPrev().setNext(null);
			length--;
		}
	}
	
	public void print(){
		if(length==0) return;
		System.out.println("Doubly Linked List:");
		DoublyListNode node = head;
		while(node.getNext()!=null){
			System.out.println(node.getData());
			node = node.getNext();
		}
		System.out.println(node.getData());
		System.out.println("Total: "+length);
	}
	
	public DoublyListNode head() {
		return head;
	}
	public int size() {
		return length;
	}
	public void removeAll() {
		// TODO Auto-generated method stub
		
	}
	
}
