package constructors;
class vehicle{
	int wheels;
	vehicle(){
		wheels=4;
	}
}
public class nonArgConstructors {
	public static void main(String[] args) {
		vehicle car=new vehicle();
		vehicle car2=new vehicle();
		System.out.println("total wheels in car--->"+car.wheels);
		System.out.println("total wheels in car2--->"+car2.wheels);
		vehicle animalLegs=new vehicle();
		System.out.println("cow has "+animalLegs.wheels+" legs");

	}

}
