package com.niit.mr2;
import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range:");
		int n=sc.nextInt();
		//For Loop
		
		for(int i=n;i>0;i--){
			System.out.println(i);
		}
		
		//While Loop
		/*int i=n;
		while(i>0){
			System.out.println(i);
			i--;
		}*/
		
		sc.close();

	}

}
