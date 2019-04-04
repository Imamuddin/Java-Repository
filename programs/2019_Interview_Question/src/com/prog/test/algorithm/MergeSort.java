package com.prog.test.algorithm;

import java.util.Arrays;

public class MergeSort {

	static int[] sortIntArray(int mainArray[], int l,int right) {
		
		if (l<right) {
		// divide the main array to get the mid point
		int mid = (l+right) / 2;
		
		int leftArraySize = mid - l + 1; 
        int rightArraySize = right - mid;

		// initialize left and right array.
		int leftArray[] = new int[leftArraySize];
		int rightArray[] = new int[rightArraySize];

		// fill left and right array
		for (int i = 0; i < leftArray.length; i++) {
			leftArray[i] = mainArray[i];
		}

		for (int j = 0; j < rightArray.length; j++) {
			rightArray[j] = mainArray[mid +  j];
		}

		sortIntArray(leftArray,l,mid);
		System.out.println("left array :: " + Arrays.toString(leftArray));
		sortIntArray(rightArray,mid+1,right);
		System.out.println("right array :: " + Arrays.toString(rightArray));
		merge(leftArray,rightArray,mainArray);
		System.out.println("after sorting array is ::" + Arrays.toString(mainArray));
		}
		return mainArray;
	}
	
	static int [] merge(int leftArray[],int rightArray[],int mainArray[]) {
		//define the initial indices for the left and right array
		int i=0,j=0;
		//define the initial indices for the main array
		int k=1;
		
		//take the length of left and right array
		int leftArraySize=leftArray.length;
		int rightArraySize=rightArray.length;
		
		
		
		while(i<leftArraySize && j< rightArraySize) {
			
			if(leftArray[i]<=rightArray[j]) {
				mainArray[k]=leftArray[i];
				i++;
				
			}else {
				mainArray[k]=rightArray[j];
				j++;
				
			}
			k++;
			
		}
		
		while(i<leftArraySize) {
			mainArray[k]=leftArray[i];
			i++;
			k++;
		}
		
		while(j<rightArraySize) {
			mainArray[k]=rightArray[j];
			j++;
			k++;
		}
		
		return mainArray;
		
	}

	public static void main(String[] args) {
		int mainArray[] = { 6, 8, 7, 5, 4 };
		mainArray = sortIntArray(mainArray,0,mainArray.length);

	}

}
