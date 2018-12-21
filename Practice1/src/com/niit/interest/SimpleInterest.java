package com.niit.interest;

public class SimpleInterest {
	int principle;
	double rate;
	int time;
	public void setValue(int p,double r,int t){
		this.principle=p;
		this.rate=r;
		this.time=t;
	}
	public double getInterest(){
		double si=(principle*rate*time)/100;
		return si;
	}
	public double getAmount(){
		double si=(principle*rate*time)/100;
		double amount=principle+si;
		return amount;
	}
}
