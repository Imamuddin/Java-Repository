package com.prog.test.oops;

public class InitAndStaticBlock {
	
	static{
		System.out.println("static block test");
	}
	
	{
		System.out.println("init outer block test");
	}
	
	public InitAndStaticBlock() {
		System.out.println("constructor loading");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InitAndStaticBlock test =new InitAndStaticBlock();
		InitAndStaticBlock test1=new InitAndStaticBlock();
		/***
		 * if init block is defined inside the main method/other method so this block will
		 * treat as normal statement and will print  the statement
		 */
		{
			System.out.println("init block inside main method test");
		}
		
	}

}
