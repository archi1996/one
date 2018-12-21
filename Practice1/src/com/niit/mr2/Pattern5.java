package com.niit.mr2;
import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range:");
		int n=sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<n+i;j++)
			{	System.out.println(k++);
				
			}
		}
		System.out.println();
			
		sc.close();
	}

}
