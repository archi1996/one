package com.niit.area;

public class RectangleArea {
	int length;
	int breadth;
	public void setDimension(int l,int b)
	{
		length=l;
		breadth=b;
	}
	

	public RectangleArea(int l,int b){
		length=l=10;
		breadth=b=8;
	}
	public RectangleArea(int l1){
		length=breadth=l1;
	}
	
	public int getArea(){
		int area=0;
		if(length>=breadth){
		area=length*breadth;
		}
		else{
			System.out.println("invalid input");
		}
		return area;
	}
	}
	

