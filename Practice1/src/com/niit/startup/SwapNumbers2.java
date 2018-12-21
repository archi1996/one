package com.niit.startup;

public class SwapNumbers2 {
	int num1;
	int num2;
	public void setNumbers(int n1,int n2){
		this.num1=n1;
		this.num2=n2;
		
	}
	
	public void getSwapNumbersWithoutThirdVarialbe(){
		System.out.println("before swapping:"+num1+" "+num2);
		num1=num2-num1;
		num2=num2-num1;
		num1=num1+num2;
		System.out.println("after swapping:"+num1+" "+num2);
		
	}
}
