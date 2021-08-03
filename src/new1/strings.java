package new1;

public class strings {
	public static void main(String args[]) {
		String cars="aston martin,buggati,chevrolet,ducatti";
		String name[]=cars.split(",");
		for(String i:name) {
			System.out.println(i);
		}
	}

}
