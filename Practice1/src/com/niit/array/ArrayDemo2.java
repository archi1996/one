package com.niit.array;
import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter range : ");
		int m=sc.nextInt();
		
		int [][]a;
		a = new int [m][];
		System.out.println("Enter "+m+" sizes below : ");
		for(int i=0 ; i<m ; i++){
			int n = sc.nextInt();
			a[i]=new int[n];
		}
		
		System.out.println("enter elements into array :");
		for(int i=0 ; i<a.length ; i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("display array result:");
		
		for(int i=0 ; i<a.length ; i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
		

	}

}
