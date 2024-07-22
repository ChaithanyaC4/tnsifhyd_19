package com.day5.Stream_DTApi;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

                          //Filtering and Collecting method
public class StreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer>numbers =Arrays.asList(2,4,1,5,7,23,400);
		
		System.out.println(numbers);
		
		List<Integer> evennum= numbers.stream()
				                      .filter(n->n%2==0)
			           	              .collect(Collectors.toList());
		
		
		System.out.println(evennum);

	}

}
