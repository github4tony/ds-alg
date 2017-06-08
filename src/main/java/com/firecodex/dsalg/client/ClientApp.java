package com.firecodex.dsalg.client;

import com.firecodex.dsalg.impl.list.DoublyLinkedList;
import com.firecodex.dsalg.impl.list.LinkedList;
import com.firecodex.dsalg.node.DoublyListNode;
import com.firecodex.dsalg.node.ListNode;

public class ClientApp {

	public static void main(String[] args) {
		LinkedList ll =new LinkedList(new Integer(10));
		ll.insert(new Integer(20));
		ll.insert(new Integer(30));
		ll.insert(new Integer(40));
		ll.insert(new Integer(50));
		ll.print();
		ListNode ln = ll.get(10);
		if(ln!=null) System.out.println(ln.getData());
		ll.remove(3);
		ll.print();
		
		DoublyLinkedList dll =new DoublyLinkedList(new Integer(10));
		dll.insert(new Integer(20));
		dll.insert(new Integer(40));
		dll.insert(new Integer(50));
		dll.insert(new Integer(30), 2);
		dll.print();
		DoublyListNode dln = dll.get(5);
		if(dln!=null) System.out.println(dln.getData());
		dll.remove(3);
		dll.print();
	}

}
