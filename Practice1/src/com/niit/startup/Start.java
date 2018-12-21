package com.niit.startup;
import java.util.Scanner;


public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("welcome!!!");
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
		System.out.println("thank you!!!");*/
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice(1.prime 2.fibonacci 3.perfect number 4.swaping):");
		int ch=sc.nextInt();
		switch(ch){
		
				case 1:	System.out.print("enter number :");
						int num=sc.nextInt();
						Prime p=new Prime();
						p.setPrimeNumber(num);
						System.out.println("prime number result:");
						p.getPrimeNumber();	
						break;
						
				case 2:System.out.print("enter range for fibonacci series:");
						int num1=sc.nextInt();
						Fibonacci f=new Fibonacci();
						f.setRange(num1);
						System.out.println("fibonacci series:");
						f.getFibonacciSeries();
						System.out.println("\n");
						break;
				case 3:System.out.print("enter number for perfect number:");
						int num2=sc.nextInt();
						PerfectNumber pn=new PerfectNumber();
						pn.setNumber(num2);
						pn.getPerfectNumber();
						break;
				case 4:System.out.println("enter two numbers for swapping:");
						int a=sc.nextInt();
						int b=sc.nextInt();
						SwapNumbers sn=new SwapNumbers();
						sn.setNumbers(a, b);
						System.out.println("Swap using third variable");
						sn.getSwapNumberWithThirdVariable();
						SwapNumbers2 sn2=new SwapNumbers2();
						sn2.setNumbers(a,b);
						System.out.println("Swap not using third variable");
						sn2.getSwapNumbersWithoutThirdVarialbe();
						break;
				default:System.out.println("invalid input");
		}
			
		sc.close();
		
		

	}

}
