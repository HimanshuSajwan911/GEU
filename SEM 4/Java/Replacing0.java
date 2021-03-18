package experiment;

import java.util.Scanner;

public class Replacing0 {
	
	// function to reverse given number.
	static int reverse(int num){
		
		int reverse = 0;
		
		while(num != 0){
			reverse = reverse * 10 + num % 10;
			num /= 10;
		}
		
		return reverse;
	}
	
	// function to replace 0 with 1 in given number.
	static int replace0(int num){
		
		int replaced = 0;
		
		// looping through the number to replace 0 with 1.
		// the resulted number will be reversed.
		while(num != 0){
			
			int digit = num % 10;
			if(digit == 0){
				digit = 1;
			}
			
			replaced = replaced * 10 + digit;
			num /= 10;
		}
		
		// reversing the updated number.
		replaced = reverse(replaced);
		
		return replaced;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input number: ");
		int num = sc.nextInt();
		
		int replaced_num = replace0(num);
		System.out.println("Replaced numer: " + replaced_num);
		
	}

}
