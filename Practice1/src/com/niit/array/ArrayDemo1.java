package com.niit.array;
import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first range :");
		int m=sc.nextInt();
		System.out.println("enter second range :");
		int n=sc.nextInt();
		int [][]a=new int[m][n];
		System.out.println("enter array elements:");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("array display:");
		for(int c=0;c<m;c++){
			for(int d=0;d<n;d++){
				System.out.print(a[c][d]+" ");
			}
			System.out.println();
		}
		
		sc.close();
			
		}
		

	}


