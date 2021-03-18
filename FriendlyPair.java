package experiment;

import java.util.Scanner;

public class FriendlyPair {

	static boolean checkFriendly(int n1, int n2){
		
		int sum1 = 0, sum2 = 0;
		
		// looping from 1 till n1.
		for(int i = 1; i < n1; i++){
			// if n1 is divisible by i perfectly,
			// then adding i to sum1.
			if(n1 % i == 0){
				sum1 += i;
			}
		}
		
		// looping from 1 till n2.
		for(int i = 1; i < n2; i++){
			// if n2 is divisible by i perfectly,
			// then adding i to sum2.
			if(n2 % i == 0){
				sum2 += i;
			}
		}
		
		if(sum1 == n1 && sum2 == n2){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int n1 = sc.nextInt();
		
		System.out.print("Input second number: ");
		int n2 = sc.nextInt();
		
		if(checkFriendly(n1, n2)){
			System.out.println("Abundant Numbers");
		}
		else{
			System.out.println("Not Abundant Numbers");
		}

	}

}
