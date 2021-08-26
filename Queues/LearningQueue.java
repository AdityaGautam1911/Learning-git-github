package Queues;
import java.util.*;
public class LearningQueue {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList();
		q.add(243);//adds to queue
		q.add(465);
		q.add(55);
		q.add(54);
		q.add(45);
		q.offer(86);//adds to queue
		System.out.println("original queue--->"+q);
		
		System.out.println("first added element is removed-->"+q.remove());//removes the element added at the beginning
		System.out.println("first added element is removed-->"+q.poll());//removes the element added at the beginning
		System.out.println("queue now--->"+q);
		
		System.out.println("current firtst element in queue is-->"+q.element());//shows the first element 
		System.out.println("current firtst element in queue is-->"+q.peek());//shows the first element 

	}

}