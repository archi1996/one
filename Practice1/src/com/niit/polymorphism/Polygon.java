package com.niit.polymorphism;

public abstract class Polygon {
	int dim1;
	int dim2;
	public Polygon(){
		
	}
	public void setDim1(int dim1){
		this.dim1=dim1;
	}
	public void setDim2(int dim2){
		this.dim2=dim2;
	}
	public int getDim1(){
		return dim1;
	}
	public int getDim2(){ 
		return dim2;
	}
	public abstract double getArea();
	public String toString(){
		return "Polygon[dim1:"+dim1+",dim2:"+dim2+"]";
	}

}
