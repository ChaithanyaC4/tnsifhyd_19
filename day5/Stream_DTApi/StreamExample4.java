package com.day5.Stream_DTApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> data=Arrays.asList("Stream", "API", "Java", "Example", "Grouping");
		
		Map<Integer, List<String>> ln=data.stream()
				                           .collect(Collectors.groupingBy(String::length));
		
		
		System.out.println(ln);
	}

}
