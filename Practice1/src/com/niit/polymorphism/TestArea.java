package com.niit.polymorphism;


public class TestArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Polygon a=new Traingle();
		a.setDim1(20);
		a.setDim2(10);
		a.getDim1();
		a.getDim2();
		System.out.println(a);
		System.out.println(a.getArea());
		Polygon b=new Rectangle();
		b.setDim1(15);
		b.setDim2(10);
		b.getDim1();
		b.getDim2();
		System.out.println(b);
		System.out.println(b.getArea());
		
		
	}

}
