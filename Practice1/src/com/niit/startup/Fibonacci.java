package com.niit.startup;

public class Fibonacci {
	int a=0;
	int b=1;
	int c;
	int range;
	public void setRange(int n){
		this.range=n;
		
	}
	public void getFibonacciSeries(){
		System.out.print(a+" "+b+" ");
		for(int i=0;i<range;i++){
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c+" ");
		}
	}

}
