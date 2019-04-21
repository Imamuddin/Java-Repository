package com.prog.test.collection;

import java.util.Comparator;


public class CustomerComparator implements Comparator<CustomerDetails> {
	public int compare(CustomerDetails a, CustomerDetails b) {

		return b.getAmount() - a.getAmount();
	}

}
