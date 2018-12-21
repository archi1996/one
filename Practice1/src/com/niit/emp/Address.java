package com.niit.emp;

public class Address {
	int hno;
	String street;
	String city;
	String pincode;
	public Address(){
		
	}
	public Address(int hno,String street,String city,String pincode){
		this.hno=hno;
		this.street=street;
		this.city=city;
		this.pincode=pincode;
	}
	
	public void setHouseNo(int hno){
		this.hno=hno;
	}
	public void setStreet(String st){
		this.street=st;
	}
	public void setCity(String c){
		this.city=c;
	}
	public void setPinCode(String pc){
		this.pincode=pc;
	}

	public int getHouseNo(){
		return hno;
	}
	public String getStreet(){
		return street;
	}
	public String getCity(){
		return city;
		
	}
	public String getPinCode(){
		return pincode;
	}
	public String toString(){
		return "Address[hno:"+hno+", stree:"+street+",city: "+city+",pin:"+pincode+"]";
	}
}
