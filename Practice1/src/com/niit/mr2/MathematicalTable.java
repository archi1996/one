package com.niit.mr2;
import java.util.Scanner;

public class MathematicalTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number for which you want to calculate math table:");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++){
			int calc=n*i;
			System.out.println(n+"*"+i+" = "+calc);
		}
		sc.close();

	}

}
