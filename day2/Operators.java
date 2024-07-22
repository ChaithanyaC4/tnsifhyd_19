package com.day2;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10+90;
		
		String s="Java"+"Developer";
		
		System.out.println("Addition result => a= "+a+", s= "+s);
		
		float x=12.5601f;
		double y=x-0.7584;
		
		System.out.println("Subtraction result => X= "+x+", Y= "+y);
		
		int n=12;
		
		System.out.println("Multiplication result => "+n*2);
		
		int n1=n/2;
		System.out.println("Division result => "+n1);
		
		int n2=n1%2;
		
		System.out.println("Modulus result =>"+n2);
		
		System.out.println("Post Increment Result= "+ n1++);
		System.out.println("Pre Increment Result= "+ ++n1);
		
		int n3=10;
		System.out.println("Post Decrement Result= "+ n3--);
		System.out.println("Pre Decrement Result= "+ --n3);
		
		int age=19;
		boolean b1=(age>18)?true:false;
		System.out.println("Ternanry Operator: "+b1);
		
		if(b1) {
			System.out.println("Eligible to Vote");
		}else {
			System.out.println("Not Eligible to Vote");
		}
		
		int num=19;
		num+=1;
		System.out.println(num);
		num-=1;
		System.out.println(num);
		num*=2;
		System.out.println(num);
		num/=2;
		System.out.println(num);
		num%=5;
		System.out.println(num);
		
	}

}
