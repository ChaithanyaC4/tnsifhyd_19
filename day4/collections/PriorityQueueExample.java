package com.day4.collections;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		
		pq.add(1);
		pq.add(2);
		pq.add(3);
		pq.add(4);
		pq.add(5);
		
		System.out.println(pq);
		System.out.println("Top Element of PriorityQueue: "+pq.peek());
		
		System.out.println("Remove Top Element from Pq: "+pq.poll());
		System.out.println(pq);
        System.out.println("Top Element of PriorityQueue: "+pq.peek());
		
		System.out.println("Remove Top Element from Pq: "+pq.poll());
		System.out.println(pq);
	}

}
