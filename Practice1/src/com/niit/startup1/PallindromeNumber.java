package com.niit.startup1;

public class PallindromeNumber {
	int num;
	int originalNum;
	int rem;
	int reverse=0;
	public void setNumber(int n){
		this.num=n;
	}
	public void getPallindromeNumber(){
		originalNum=num;
		while(num!=0){
			rem=num%10;
			reverse=reverse*10+rem;
			num/=10;
		}
		if(originalNum==reverse){
			System.out.println("pallindrome number");
		}else{
			System.out.println("not a pallindrome number");
		}
		
	}
}
