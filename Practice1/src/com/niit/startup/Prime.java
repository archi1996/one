package com.niit.startup;

public class Prime {
	int num;
	int flag=0;
	public void setPrimeNumber(int n)
	{
		this.num=n;
	}
public void getPrimeNumber(){
	if(num%2==0){
		System.out.println(num+"is not prime");
		
	}
	else{
		
			for(int i=2;i<num/2;i++){
				if(num%i==0){
					flag=0;
					break;
				}
			}
			if(flag==1){
				System.out.println(num+" is prime");
			}
			
	}
	
	}
	

}
