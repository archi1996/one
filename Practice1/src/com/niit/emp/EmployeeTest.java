package com.niit.emp;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee id:");
		int id=sc.nextInt();
		System.out.println("enter employee name:");
		String name=sc.next();
		System.out.println("enter employee designation:");
		String desig=sc.next();
		Employee e1=new Employee();
		e1.setId(id);
		e1.setName(name);
		e1.setDesignation(desig);
		e1.getId();
		e1.getName();
		e1.getDesignation();
		System.out.println(e1);
		System.out.println();
		
		System.out.println();
		Employee e=new Employee(101,"Adam","CEO",new Address(200,"park street","kolkata","700012"));
		Employee e2=new Employee(102,"Vincent","Manager",new Address(201,"camac street","kolkata","700023"));
		System.out.println("e:"+e);
		System.out.println("e2:"+e2);		
		
		System.out.println("enter house no.:");
		int hno=sc.nextInt();
		System.out.println("enter street:");
		String s=sc.next();
		System.out.println("enter city:");
		String c=sc.next();
		System.out.println("enter pin:");
		String p=sc.next();
		System.out.println();
		
		Address a=new Address();
		a.setHouseNo(hno);
		a.setStreet(s);
		a.setCity(c);
		a.setPinCode(p);
		a.getHouseNo();
		a.getStreet();
		a.getCity();
		a.getPinCode();
		System.out.println(a);
		
		
		
	
		
		
		
		
		
		sc.close();
		
		
		
	}

}
