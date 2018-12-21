package com.niit.startup1;

public class ReverseNumber {
	int num;
	int originalNum;
	int rem;
	int reverse=0;
	public void setNumber(int n){
		this.num=n;
	}
	public void getReverseNumber(){
		originalNum=num;
		while(num!=0){
			rem=num%10;
			reverse=reverse*10+rem;
			num/=10;
		}
		System.out.println("reverse of number "+num+" is "+reverse);
	}
}
