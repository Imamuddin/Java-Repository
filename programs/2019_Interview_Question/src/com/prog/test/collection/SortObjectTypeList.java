package com.prog.test.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortObjectTypeList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<CustomerDetails> list = new ArrayList<>();

		CustomerDetails custDetails = new CustomerDetails();
		custDetails.setCustomerId("Bob");
		custDetails.setAmount(40);

		CustomerDetails custDetails1 = new CustomerDetails();
		custDetails1.setCustomerId("Nikhil");
		custDetails1.setAmount(90);

		list.add(custDetails);
		list.add(custDetails1);
		
		Collections.sort(list, new CustomerComparator());
		
		System.out.println("Get List first element ::" + list.get(0).getCustomerId());

		for (CustomerDetails custDet : list) {
			System.out.println("CustomerId::" + custDet.getCustomerId()
					+ " Amount::" + custDet.getAmount());
		}

	}

}
