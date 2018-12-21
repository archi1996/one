package com.niit.area;
import java.util.Scanner;
public class AreaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter choice(1.rectangle 2.cube 3.circle):");
		int ch=sc.nextInt();
		switch(ch){
		case 1:System.out.print("enter length:");
				int val1=sc.nextInt();
				System.out.print("enter breadth:");
				int val2=sc.nextInt();
				RectangleArea ra=new RectangleArea(val1);
				//ra.setDimension(val1, val2);	
				System.out.println("area is:"+ra.getArea());
				RectanglePerimeter rp=new RectanglePerimeter(val1,val2);
				System.out.println("perimeter is:"+rp.getPerimeter());
				
				//rp.setDimension1(val1, val2);
				RectangleArea ra1=new RectangleArea(val1,val2);
				System.out.println("area is:"+ra1.getArea());
				RectanglePerimeter rp1=new RectanglePerimeter(val2);
				System.out.println("perimeter is:"+rp1.getPerimeter());
				break;
				
		case 2:	System.out.println("enter a number to find cube:");
				int n=sc.nextInt();
				Cube c=new Cube();
				c.setCubeValue(n);
				System.out.println("cube of a number is:"+c.getCube());
				break;
				
		case 3:	System.out.print("enter radius:");
				double r=sc.nextDouble();
				Circle cp=new Circle();
				cp.setCircleDimension(r);
				System.out.println("area of circle:"+cp.getCircleArea());
				System.out.println("circumference:"+cp.getCircleCircumference());
				//System.out.println("pi:"+cp.getPi());
				System.out.println("Pi value:"+Circle.PI);
				
				break;
		default:System.out.println("invalid input");
		/*System.out.print("enter pi value:");
		double pi=sc.nextDouble();*/
		}	
		
		sc.close();
		
	}


}
