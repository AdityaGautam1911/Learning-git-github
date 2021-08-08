package list;
import java.util.ArrayList;
import java.util.List;
public class linkedList {
	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList();//generics(< >) used for specific type of values
		name.add("Aditya");
		name.add("Rohan");
		System.out.println(name);
		
		List things=new ArrayList();//generics not used so we can add all data types values
		//ArrayList things=new ArrayList(); //this is same as the above line but we use above line for easy conversions
		things.add("table");
		things.add("chair");
		things.add(7);
		System.out.println(things);
		
		List<Integer> rollNo=new ArrayList();
		rollNo.add(1);
		rollNo.add(2);
		System.out.println(rollNo);
		
		List<String> fruits=new ArrayList();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("orange");

		
		System.out.println("############## PRACTISING METHODS ###################");
		
		List<String> practice=new ArrayList();
		practice.add("Aditya");//add() adds elements to ArrayList
		practice.add("Ram");
		practice.add("Shyaam");
		System.out.println("size of ArrayList is---> "+practice.size());//returns size of the ArrayList
		practice.remove("Ram");//removes specified value from ArrayList
		practice.addAll(fruits);//add another(fruits) ArrayList to this(practice) ArrayList
		System.out.println(practice.get(2));//gets the value at specified index
		practice.set(1,"banana");//changes value at the specified index to given value
		System.out.println(practice.contains("Aditya"));//tells if a certain value is present in ArrayList or not
		System.out.println(practice.isEmpty());//tells if ArrayList is empty or not
		practice.add("tomato");
		practice.add("potato");
		practice.toArray();//converts ArrayList to Array,to view this array,following is to be done(see next line)
		
		System.out.println("############ CONVERTIING ArrayList to array ##########");
		String temp[]=new String[practice.size()];
		practice.toArray(temp);
		for(String i:temp) {
			System.out.println(i);
		}
		
		
		practice.removeAll(fruits);//removes specified group of values(removes values of fruits from practice ArrayList)
		practice.clear();//removes all elements from the ArrayList
		
		
		
		
		
	}

}
