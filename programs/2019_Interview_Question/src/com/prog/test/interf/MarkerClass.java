package com.prog.test.interf;

public class MarkerClass {
	
	public void testMarker() throws MyException{
		if((this instanceof CustMarkerInterface)){
			System.out.println("Successfull");
		}else {
			throw new MyException("Must implement interface CustMarkerInterface");
		}
		
	}

}
