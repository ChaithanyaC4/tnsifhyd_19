package com.day4;

public class StringBufferClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer("Nagesh");
		sb.append(" kurva");
		System.out.println(sb);
		sb.replace(0, 6, "venkat");
		System.out.println(sb);
		System.out.println(sb.charAt(4));
		sb.insert(0, "hi ");
		System.out.println(sb);
		sb.replace(10,sb.length(), "goud");
		System.out.println(sb);
		sb.delete(0, 3);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);

	}

}
