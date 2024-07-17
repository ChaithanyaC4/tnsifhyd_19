package com.day2;



public class DefaultConstructor {

	private int id;
	private String name;
	private String Address;
	private int phoneno;
	
	public DefaultConstructor() {
		
		id=21;
		name="venkat";
		Address="Sheriguda,Ibrahimpatnam";
		phoneno=897797977;
		
	}
	public void details() {
		System.out.println("ID="+id+"\n"+"Name="+name+"\n"+"Address="+Address+"\n"+"Mobile="+phoneno);
	}
}
