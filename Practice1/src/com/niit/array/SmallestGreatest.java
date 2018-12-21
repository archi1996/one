package com.niit.array;
import java.util.Scanner;

public class SmallestGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int ar[];
		System.out.print("enter array size:");
		int n=sc.nextInt();
		ar=new int[n];
		System.out.print("enter array elements:");
		for(int i=0;i<ar.length;i++){
			ar[i]=sc.nextInt();
						
		}
		//greatest element
		int max=ar[0];
		for(int i=0;i<ar.length;i++){
				if(max<ar[i]){
					max=ar[i];
						}
		}
		System.out.println("greatest number:"+max);
		//smallest element
		int min=ar[0];
		for(int i=0;i<ar.length;i++){
			if(min>ar[i]){
				min=ar[i];
				
			}
		}
		System.out.println("smallest number:"+min);
		
		
		sc.close();
	}

}
