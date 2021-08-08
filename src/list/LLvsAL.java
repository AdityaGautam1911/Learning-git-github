package list;
import java.util.*;
public class LLvsAL {//LL-LinkedList/AL-ArrayList
	public static void main(String[] args) {
		List<Integer> ll=new LinkedList();
		List<Integer> al=new ArrayList();
		getTimeDiff(ll);
		getTimeDiff(al);
		System.out.println("THIS SHOWS THAT INSERTION/DELETION FROM A LinkedList IS EASIER THAN ArrayList");
	}
	static void getTimeDiff(List<Integer> list) {
		long start=System.currentTimeMillis();
		
		for(int i=0;i<100000;i++) {
			list.add(0,i);//inserting at the starting
		}
		
		long end=System.currentTimeMillis();//gives time passed after running the code
		
		System.out.println("time taken by "+list.getClass().getName()+"--->"+(end-start));
	}

}
