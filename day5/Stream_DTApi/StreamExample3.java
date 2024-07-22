package com.day5.Stream_DTApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> sortnums=nums.stream()
				                   .sorted()
				                   .limit(2)
				                   .collect(Collectors.toList());
		
		System.out.println(sortnums);

	}

}
