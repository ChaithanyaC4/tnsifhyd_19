package com.day5.java8.FI_lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionForeachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names= {
				"Rcb",
				"csk",
				"kr",
				"rr",
				"Gt"
		};
		System.out.println("data printed normally without function");
		
		for(String name:names) {
			System.out.println(name);
		}
		System.out.println();
		
		
		List<String> data=new ArrayList<String>();
		
		for(String name:names) {
			data.add(name);
		}
		System.out.println("Data printed using lambda expression:");
		data.forEach((n)->System.out.println(n));
		
	}

}
