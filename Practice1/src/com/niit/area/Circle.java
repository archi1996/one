package com.niit.area;

public class Circle {
	double radius;
	public static  final double PI=(double)22/7;
	
	public void setCircleDimension(double r){
		this.radius=r;
		//this.pi=pi;
	}
	public double getCircleArea(){
		double area=PI*radius*radius;
		return area;
	}
	public double getCircleCircumference(){
		double circum=2*PI*radius;
		return circum;
	}
	/*public double getPi(){
		return PI;
	}*/

}
