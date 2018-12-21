package com.niit.emp;
import com.niit.emp.Address;

public class Employee {
	int empId;
	String empName;
	String empDesignation;
	Address res;
	
	
	public Employee(){
		
	}
	public Employee(int eid,String ename,String edsig,Address res){
		empId=eid;
		empName=ename;
		empDesignation=edsig;
		this.res=res;
	}
	
	public void setId(int id){
		this.empId=id;
	}
	public void setName(String name){
		this.empName=name;
	}
	public void setDesignation(String desig){
		this.empDesignation=desig;
	}
	public void setAddress(Address ad){
		this.res=ad;
	}
	public Address getAddress(){
		return res;
	}
	public int getId(){
		return empId;
	}
	public String getName(){
		return empName;
	}
	public String getDesignation(){
		return empDesignation;
	}
	public String toString( ){
		return "Employee[empId:"+empId+",name: "+empName+",designation:"
	+empDesignation+",address: "+res+"]";
				
	
	}
	/*public void display(){
		System.out.println(res.hno+" "+res.street+" "+res.city+" "+res.pincode+" ");
	}*/
	
}
