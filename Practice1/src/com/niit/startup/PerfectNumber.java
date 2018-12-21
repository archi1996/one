package com.niit.startup;

public class PerfectNumber {
	int num;
	int sum=0;
	int rem;
	public void setNumber(int n){
		this.num=n;
	}
	public void getPerfectNumber(){
		for(int i=1;i<num-1;i++){
			rem=num%i;
			if(rem==0)
			{
				sum+=i;
			}
		}
		if(sum==num){
			System.out.println(num+" is perfect number");
		}else{
			System.out.println(num+" is not perfect number");
		}
	}

}
