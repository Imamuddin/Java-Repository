package com.prog.test.general;

public class StringPermutation {
	public static void permutateString(String str, int left, int right) {
		
		if(left==right) {
			System.out.println(str);
		}else {
			for(int i=left ;i<=right;i++) {
				str=swap(str,left,i);
				permutateString(str,left+1,right);
				str=swap(str,left,i);
			}
			
		}

	}
	
	public static String swap(String str,int left,int i) {
		char temp;
		char charArray[]=str.toCharArray();
		temp=charArray[left];
		charArray[left]=charArray[i];
		charArray[i]=temp;
		return String.valueOf(charArray);
	}

	public static void main(String[] args) {
		String str = "ABCd";
		permutateString(str,0,str.length()-1);

	}

}
