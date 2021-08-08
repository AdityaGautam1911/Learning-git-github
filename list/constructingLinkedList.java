package list;
public class constructingLinkedList {
	Node head;
	
	//function to add data at the end of the LinkedList
	void add(int data) {
		Node toAdd=new Node(data);
		
		if(isEmpty()) {//adding value to the starting if ArrayList is empty
			head=toAdd;//adding value to the starting if ArrayList is empty
			return;    //adding value to the starting if ArrayList is empty
		}
		
		//traversing to end of the LinkedList
		Node temp=head;
		while(temp.next!=null) {//going till we reach a null point(end of LinkedList) in this while loop
			temp=temp.next;//going next till end of the LinkedList is reached
		}
		temp.next=toAdd;//adding value to end of the LinkedList
	}
	
	//function to print the LinkedList
	void print() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	boolean isEmpty() {
		if(head==null) {
			return true;
		}else {
			return false;
		}
	}
	static class Node{//nodes are the different storages in which elements are kept 
		int data;//node has some data
		Node next;//goint to the next node after adding data to present node
		public Node(int data) {
			this.data=data;//placing the given into present node and
			next=null;     //making the next node null
		}
	}
}
