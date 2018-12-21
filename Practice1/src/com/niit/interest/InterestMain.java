package com.niit.interest;
import java.util.Scanner;

public class InterestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter principle:");
		int p=sc.nextInt();
		System.out.print("enter rate:");
		double r=sc.nextDouble();
		System.out.print("enter time:");
		int t=sc.nextInt();
		System.out.println("enter your choice(1.simple interest 2.compound interest):");
		int ch=sc.nextInt();
		switch(ch){
		
		case 1:SimpleInterest s=new SimpleInterest();
				s.setValue(p, r, t);
				System.out.println("simple interest:"+s.getInterest());
				System.out.println("amount is:"+s.getAmount());
				break;
		case 2:CompoundInterest c=new CompoundInterest();
				c.setValue1(p, r, t);
				System.out.println("compound interest:"+c.getCompoundInterest());
				System.out.println("amount is:"+c.getAmount());
				break;
		default:System.out.println("invalid input");
		}
		
		
		sc.close();
		

	}

}
