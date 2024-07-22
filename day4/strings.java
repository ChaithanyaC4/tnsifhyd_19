package com.day4;

import java.util.Scanner;

public class strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		char[] ch={'n','a','g','e','s','h'};
		String s=new String(ch);
		String name="vallabh";
		String fullname="Garini1 vallibh2";
		String location="Hyderabad";
		String sentence="I am good boy in my college";
//		System.out.print("Enter String :");
//		String para=sc.nextLine();
//		System.out.println(para);
		
		System.out.println("sub string: "+sentence.substring(5,9));
		
		System.out.println("String: "+s);
		
		//String Concat
		System.out.println("Concated String: "+(s+" "+name));
		System.out.println("Concat() func String: "+name.concat(" "+s));
		
		//Strings are immutable
		 String s1="Sachin";  
		 s1=s1.concat(" Tendulkar");  
		 System.out.println(s1);  
		
		 //comapre string
		 
		 String s2="Hello";
		 String s3="Hello";
		 System.out.println(s2.equals(s3));
		 System.out.println(s3.compareTo(s2));
		 System.out.println(s2==s3);
		 s3.toUpperCase();//as string is immutable s3 can't be changed
		 System.out.println(s3.replace("h", "e"));
		 System.out.println(s3);
		 System.out.println(fullname.replace("\\d", "a")); //replace char i in whole string by a
			
		 System.out.println(fullname.replaceAll("\\d", "x")); //replace all is same as replace but used to replace even digits also
		 
		 for(int i=0;i<s3.length();i++) {
			 System.out.println(s3.charAt(i));
		 }
		 String name1="kalki 2928AD";
		 System.out.println(name1.contains("prabhas"));
		 System.out.println(name1.contains("KALKI")); //contains takes into consideration of case sensitive

		 System.out.println(name1.endsWith("2928AD"));
		 System.out.println(name1.endsWith("D"));
		 System.out.println(location);
		sc.close();
	}

}
