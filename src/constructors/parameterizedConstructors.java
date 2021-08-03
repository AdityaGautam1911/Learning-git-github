package constructors;
class Vehicle{
	int wheels;
	Vehicle(int noOfWheels){
		wheels=noOfWheels;
	}
}
public class parameterizedConstructors {
	public static void main(String[] args) {
		Vehicle car=new Vehicle(4);
		Vehicle scooty=new Vehicle(2);
		System.out.println(scooty.wheels+"wheels are present in scooty");
	}

}
