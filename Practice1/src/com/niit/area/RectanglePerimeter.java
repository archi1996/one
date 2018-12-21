package com.niit.area;

public class RectanglePerimeter {
	int length;
	int breadth;
	/*public void setDimension1(int val1,int val2){
		this.length=val1;
		this.breadth=val2;
	}*/
	public RectanglePerimeter(int l,int b){
		length=l;
		breadth=b;
	}
	public RectanglePerimeter(int b1){
		length=breadth=b1;
	}
	public int getPerimeter(){
		int perimeter=2*(length+breadth);
		return perimeter;
	}

}
