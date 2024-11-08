package Collections;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		
		PriorityQueue<String> pQueue = new PriorityQueue<String>();
		
		//Adding elements
		pQueue.add("satya");
		pQueue.add("reddy");
		pQueue.add("Test");
		pQueue.add("apple");
		
		//check the element
		System.out.println(pQueue.contains("apple"));
		
		//Accessing head of element without removing
		System.out.println("Peaked :"+pQueue.peek());
		
		//removing and retriecing the haed element
		System.out.println("Poll :"+pQueue.poll());
		
		//Print all elements
		System.out.println("PriorityQueue elements :");
		for(String elements : pQueue) {
			System.out.println(elements);
		}
	}

}
