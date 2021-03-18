package experiment;

import java.util.Scanner;

public class Bank {
	
public static void main(String[] args){
		
		int c, n;
		float p, r, a;
		
		System.out.println("1. Term Deposite");
		System.out.println("2. Recurring Deposite");
		System.out.print("Enter your choice: ");
		
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		
		switch(c){
			// for option 1.
			case 1:	{
						// asking to input principal amount.
						System.out.print("Input Principal amount: ");
						p = sc.nextFloat();
						
						// asking to input rate of interest.
						System.out.print("Input rate of interest: ");
						r = sc.nextFloat();
						
						// asking to input time period.
						System.out.print("Input time period in years: ");
						n = sc.nextInt();
						
						// calculating maturity amount.
						a = p * (1 + r/100) * n;
						
						// printing maturity amount.
						System.out.println("maturity amount= " + a);
						
						break;
					}
			
			// for option 2.
			case 2:	{
						// asking to input monthly installment.
						System.out.print("Input monthly installment: ");
						p = sc.nextFloat();
		
						// asking to input rate of interest.
						System.out.print("Input rate of interest: ");
						r = sc.nextFloat();
				
						// asking to input time period.
						System.out.print("Input time period in months: ");
						n = sc.nextInt();
				
						// calculating maturity amount.
						a = p * n + p * n * (n + 1)/2 * r/100 * 1/12;
						
						// printing maturity amount.
						System.out.println("maturity amount= " + a);
						
						break;
					}
			// for incorrect option.
			default :	System.out.println("Invalid input!!");
		
		}
		
	}

}
