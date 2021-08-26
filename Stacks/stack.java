package Stacks;
import java.util.*;
public class stack {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack();
		s.push(34);//adding element to stack
		s.push(23);
		s.push(54);
		s.push(346);
		s.push(4654);
		System.out.println("current stack is-->"+s);
		
		System.out.println("removing the topmost element--->"+s.pop());
		
		System.out.println("seeing the topmost element--->"+s.peek());
		
		System.out.println("this tells the position of given element from the top---> "+s.search(23));
		
		System.out.println("is the stack empty??---> "+s.empty());
	}

}
