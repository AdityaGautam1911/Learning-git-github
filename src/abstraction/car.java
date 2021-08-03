package abstraction;
public abstract class car {
	public abstract void accelerate();//abstract class(empty)
	public abstract void breaking();//these function must be completed in its(car class) daughter class
	
	public void honk() { //concrete method
		System.out.println("car is honking");
	}
}
//abstract keyword wont allow car class to get instantiated as it is not needed to instantiate car class
//but we need to instantiate the car model class since as a customer we dont just repair any general car
//but we repair a particular car model(eg-audi(),wagonr() here)