package com.ASCIIAndMarks;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter the mark for Physics");
		int phy=sc.nextInt();
		System.out.println("Please Enter the mark for Chemistry");
		int chem=sc.nextInt();
		System.out.println("Please Enter the mark for Mathmatics");
		int math=sc.nextInt();
		
		
		float avg=(phy+chem+math)/3;
		System.out.println("The average score for the three subjects is as follows "+avg);
		
		if(avg>70){
			System.out.println("The grade is "+"A");
		}
		else if(avg>=61 & avg <70 ){
			System.out.println("The grade is "+"B");
		}
		else if(avg<61){
			System.out.println("The grade is "+"C");
		}
		else{
			System.out.println("The grade is "+"C");
		}
		
	
		
	}

}
