package com.day5.Stream_DTApi;

import java.util.Arrays;
import java.util.List;
                               //Mapping and Reducing
public class StreamExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>words=Arrays.asList("Stream","API","DateAPI","TimeAPI");
		
		int totallength=words.stream()
				             .mapToInt(String::length)
				             .sum();
		
		System.out.println("TotalLength="+totallength);
	}

}
