package com.ASCIIAndMarks;

import java.math.BigInteger;
import java.util.Scanner;

public class TestDemo {

	public static int getASCI(int number){

		String str =Integer.toString(number);  // or anything else

		// Stores strings of integer representations in sequence
		StringBuilder sb = new StringBuilder();
		for (char c : str.toCharArray())
			sb.append((int)c);

			// store ascii integer string array in large integer
			Integer mInt = new Integer(sb.toString());
			return mInt;
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int number=scan.nextInt();
		
		if(number>0){
			
			
			System.out.println("You Have Entered Positive Value"+"And the ASCI VALUE for the same is "+getASCI(number));
		}
		else{
			System.out.println("You Have Entered Negative Value”e"+"And the ASCI VALUE for the same is "+getASCI(number));
		}
		
		
	}

}
