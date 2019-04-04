package com.prog.test.collection;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {
	static void addElements(LinkedList<String> linkedList) {
		linkedList.add("test1");
		linkedList.add("test2");
		linkedList.add("test3");
		linkedList.add("test4");
		System.out.println("Linked List added element::" + linkedList);
		linkedList.addFirst("FirstElement");
		linkedList.addLast("LastElement");
		System.out.println("Linked List after first and lastElement::"
				+ linkedList);
		linkedList.set(4, "indexedElement");
		System.out.println("after setting the element::" + linkedList);
		linkedList.add(5, "addindexElement");
		System.out.println("GetFirst and LastElement::" + linkedList.getFirst()
				+ " " + linkedList.getLast());

	}

	static void reverseByIterator(LinkedList<String> linkedList) {
		Iterator<String> itr = linkedList.descendingIterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + ",");
		}

	}

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		addElements(linkedList);
		System.out.println("FinalLinked List::" + linkedList);
		reverseByIterator(linkedList);
		

	}

}
