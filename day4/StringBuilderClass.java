package com.day4;

public class StringBuilderClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb=new StringBuilder("java");
		System.out.println(sb);
		
		sb.append(" 8 features");
		System.out.println(sb);

		sb.insert(sb.length(), " are fi,lambda expression...."
				+ "");
		System.out.println(sb);
		
		sb.replace( 20,22, "Functional Interface");
		System.out.println(sb);
		
		StringBuilder s=new StringBuilder("vallabha");
		
		s.delete(7, s.length());
		System.out.println(s);
		
		
	}

}
