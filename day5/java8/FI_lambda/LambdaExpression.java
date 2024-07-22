package com.day5.java8.FI_lambda;

public class LambdaExpression {

	public static void main(String[] args) {
		
		Drawabble d1=()->{
			System.out.println("I am Drawing");
		};
		d1.draw();
		  
		Drawaabble2 d2=(a)->{
			
			return "I drawn a animal "+a;
		};
		System.out.println(d2.draw("Tiger"));
		
		Addable a=(num1,num2)->{
			return (num1+num2);
		};
		
		System.out.println("Addition result= "+a.add(12, 32));
		

	}
}
