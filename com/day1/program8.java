package com.day1;

public class program8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="madam",rs1 ="";
		char ch;
		
		for(int i=0;i<s1.length();i++) {
			ch=s1.charAt(i);
			rs1=ch+rs1;
		}
		System.out.println("Reversed String: "+rs1);
		
		if(s1.compareTo(rs1)==0) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}

	}

}
