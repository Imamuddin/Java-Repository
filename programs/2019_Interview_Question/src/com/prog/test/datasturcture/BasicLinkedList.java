package com.prog.test.datasturcture;

import java.util.LinkedList;

public class BasicLinkedList {

	public static void main(String[] args) {
		LinkedList<String> linkedList=new LinkedList<>();
		linkedList.add("Test1");
		linkedList.add("Test2");
		linkedList.add("Test3");
		
		for(String str:linkedList) {
			System.out.println(str);
		}

	}

}
