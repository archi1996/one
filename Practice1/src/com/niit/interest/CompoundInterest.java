package com.niit.interest;
import java.lang.Math;

public class CompoundInterest {
	int principle;
	double rate;
	int time;
	public void setValue1(int p,double r,int t){
		this.principle=p;
		this.rate=r;
		this.time=t;
	}
	public double getAmount(){
		double amount=principle*(Math.pow((1+rate/100),time));
		return amount;
	}
	public double getCompoundInterest(){
		double amount=principle*(Math.pow((1+rate/100),time));
		double ci=amount-principle;
		return ci;
	}
	
}
