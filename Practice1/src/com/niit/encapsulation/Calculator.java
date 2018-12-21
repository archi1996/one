package com.niit.encapsulation;

public class Calculator {
	int val1;
	int val2;
	
	public void read(int val1,int val2){
		this.val1=val1;
		this.val2=val2;
	}
	public void read(int v){
		val1=val2=v;
	}
	public int add(){
		int sum=val1+val2;
		return sum;
	
	}
	public int diff(){
		int sub=val1-val2;
		return sub;
	}
	public int product(){
		int pro=val1*val2;
		return pro;
	}
	public int divide(){
		int quo=0;
		if(val2==0){
			System.out.println("invalid input");
		}
		else{
			 quo=val1/val2;
			
			
		}
		 return quo;
		
	}

}
