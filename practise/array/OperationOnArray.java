package com.operative.practise.array;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

import com.operative.practise.interfaces.ArrayOperation;

public class OperationOnArray implements ArrayOperation {

	@Override
	public void sumOfElements(int[] array) {
		// TODO Auto-generated method stub
		int result = 0;
		
		for(int i : array)
			result += i;
		System.out.println("Sum of all elements of the array is: " + result);
		
	}

	@Override
	public void sumOfEvenElements(int[] array) {
		// TODO Auto-generated method stub
		int result = 0;
		
		for(int i : array) {
			if(i % 2 == 0)
				result += i;
		}
		System.out.println("Sum of even elements is: " + result);
		
	}

	@Override
	public void sumOfEvenPosition(int[] array, int size) {
		// TODO Auto-generated method stub
		int result = 0;
		
		for(int i = 0; i < size; i ++ ) 
			if(i % 2 == 0)
				result += array[i];
		
		System.out.println("Sum of elements at even position is: " + result);
		
	}

	@Override
	public void descArray(int[] array) {
		// TODO Auto-generated method stub
		  
	        // Sorting the array in ascending order
	        Arrays.sort(array);
	  
	        // Reversing the array
	        reverse(array);
	  
	        // Printing the elements
	        System.out.println(Arrays.toString(array));
	    }	  
	    public static void reverse(int[] array)
	    {
	  
	        // Length of the array
	        int n = array.length;
	  
	        // Swaping the first half elements with last half
	        // elements
	        for (int i = 0; i < n / 2; i++) {
	  
	            // Storing the first half elements temporarily
	            int temp = array[i];
	  
	            // Assigning the first half to the last half
	            array[i] = array[n - i - 1];
	  
	            // Assigning the last half to the first half
	            array[n - i - 1] = temp;
	        }
	    }		

	@Override
	public void maxElement(int[] array) {
		// TODO Auto-generated method stub
		int max = array[0];
		
		for(int i : array) {
			if(i > max)
				max = i;
		}
		System.out.println("Maximum element of array is: " + max);
	}

	@Override
	public void minElement(int[] array) {
		// TODO Auto-generated method stub
		int min = array[0];
		
		for(int i : array)
			if(i < min)
				min = i;
		
		System.out.println("Minimum element of array is: " + min);
		
	}

	@Override
	public void duplicateElements(int[] array) {
		// TODO Auto-generated method stub
		Arrays.sort(array);
		int count = 1;
		
		for(int i = 0; i < array.length-1; i++) {
			if(array[i] == array[i+1]) {
				count++;
			}
			if(count >= 2 && array[i] != array[i+1]) {
				System.out.println(array[i] + " Count: " + count);
				count = 1;
			}
			if(count >= 2 && i == array.length - 2) {
				System.out.println(array[i] + " Count: " + count);
			}
		}
		
		
		
	}	
	

	@Override
	public void lengthOfArray(int[] array) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 0; i < array.length; i ++)
			++ count;
		System.out.println("Length of array is: " + count);
	}

	@Override
	public void sortAscending(int[] array) {
		// TODO Auto-generated method stub
		int temp = 0;
		
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array.length-1; j ++) {
				if(array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
				}
			}
		}
		System.out.println("the sorted array is: ");
		for(int i : array)
			System.out.print(i + " ");
			
	}

	@Override
	public void sortDescending(int[] array) {
		// TODO Auto-generated method stub
		int temp = 0;
		for(int i = 0; i < array.length; i ++) {
			for(int j = 0; j < array.length-1; j ++) {
				if(array[j] < array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
				}
			}
		}
		System.out.println("the sorted array is: ");
		for(int i : array)
			System.out.print(i + " ");
		
	}
	
	public static void main(String[] args) {
							
		Scanner sc = new Scanner(System.in);
		OperationOnArray obj = new OperationOnArray();

		
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter " + size + " elements of the array.");
		for(int i = 0; i < size; i ++) {
			arr[i] = sc.nextInt();
		}
		
		int rep = 1;
		while(rep != 0)
		
		{System.out.println(""
				+ "\n"
				+ "Enter the choice of operation"
				+ "\n1. SUM of ALL ELEMENTS"
				+ "\n2. SUM of EVEN ELEMENTS"
				+ "\n3. SUM of elements at EVEN POSITION"
				+ "\n4. Print array in DESCENDING ORDER"
				+ "\n5. Print MAX ELEMENT of array"
				+ "\n6. Print MIN ELEMENT of array"
				+ "\n7. Print all DUPLICATE ELEMENTS"
				+ "\n8. SIZE OF ARRAY without using function"
				+ "\n9. SORT ASCENDING array"
				+ "\n10. SORT DESCENDING array");
		int choice = sc.nextInt();
		
		
		switch(choice) {
		
		case 1:
			obj.sumOfElements(arr);
			break;
			
		case 2:
			obj.sumOfEvenElements(arr);
			break;
			
		case 3:
			obj.sumOfEvenPosition(arr, size);
			break;
			
		case 4:
			obj.descArray(arr);
			break;
			
		case 5:
			obj.maxElement(arr);
			break;
			
		case 6:
			obj.minElement(arr);
			break;
			
		case 7:
			obj.duplicateElements(arr);
			break;
			
		case 8:
			obj.lengthOfArray(arr);
			break;
			
		case 9:
			obj.sortAscending(arr);
			break;
			
		case 10:
			obj.sortDescending(arr);
			break;
			
			default:
				System.out.println("Enter the valid choice");
		}
	}
	}

}
