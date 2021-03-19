package experiment;

import java.util.Scanner;

public class ZigzagSort {
	
	static int[] zigzagSort(int[] arr){
		
		boolean flag = true;
		
		for(int i = 0; i < arr.length - 2; i++){
			// for a < b.
			if(flag){
				// if a > b, swapping them.
				if(arr[i] > arr[i + 1]){
					int t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}
			}
			// for x > y.
			else{
				// if a < b, swapping them.
				if(arr[i] < arr[i + 1]){
					int t = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = t;
				}
			}
			// flipping flag value. 
			flag = !flag;
			
		}
		
		return arr;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input size of array: ");
		// taking input - size of array.
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		System.out.print("Input elements of array: ");
		// taking input - elements of array.
		for(int i = 0; i < size; i++){
			arr[i] = sc.nextInt();
		}
		
		arr = zigzagSort(arr);
		
		System.out.println("Zigzag sorted array: ");
		for(int i = 0; i < size; i++){
			System.out.print(arr[i] + " ");
		}
		
	}

}
