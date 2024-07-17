package com.day1;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Vallabh",rs1 ="";
		
		StringBuilder s2=new StringBuilder();
		
	
		char ch;
		
		for(int i=0;i<s1.length();i++) {
			ch=s1.charAt(i);
			rs1=ch+rs1;
		}
		System.out.println("Reversed String: "+rs1);
	//another method
		s2.append(s1);
		s2.reverse();
		System.out.println("Reversed String: "+s2);
	}
	

}
