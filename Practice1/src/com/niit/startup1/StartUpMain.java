package com.niit.startup1;
import java.util.Scanner;

public class StartUpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your choice:");
		int ch =scan.nextInt();
		switch(ch){
			case 1:	System.out.println("enter numver for finding the coresponding day:");
					int num=scan.nextInt();
					SwitchCase sc=new SwitchCase();
					sc.setNumber(num);
					sc.getDay();
					break;
			case 2:System.out.println("enter number for reverse:");
					int num1=scan.nextInt();
					ReverseNumber rn=new ReverseNumber();
					rn.setNumber(num1);
					rn.getReverseNumber();
					break;
			case 3:	System.out.println("enter number for pallindrome");
					int num2=scan.nextInt();
					PallindromeNumber pn=new PallindromeNumber();
					pn.setNumber(num2);
					pn.getPallindromeNumber();
					break;
			default:System.out.println("invalid input");
			
		}
					
		
		
		
		scan.close();
	}

}
