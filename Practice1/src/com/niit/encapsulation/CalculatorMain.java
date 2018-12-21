package com.niit.encapsulation;
import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.print("enter value 1:");
		int a=sc.nextInt();
		System.out.print("enter value 2:");
		int b=sc.nextInt();
		Calculator c=new Calculator();
		c.read(a,b);//function overloading
		Calculator c1=new Calculator();
		c1.read(a);//function overloading
		System.out.println("result is:");
		System.out.println("addition is:"+c.add());
		System.out.println("difference is:"+c.diff());	
		System.out.println("product is:"+c.product());
		System.out.println("quotient is:"+c.divide());
		System.out.println();
		System.out.println("result is:");
		System.out.println("addition is:"+c1.add());
		System.out.println("difference is:"+c1.diff());	
		System.out.println("product is:"+c1.product());
		System.out.println("quotient is:"+c1.divide());
		sc.close();

	}

}
