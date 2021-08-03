package abstraction;
public class repairShop {
	public static void repairCar(car car) {//creating repairCar() function
		System.out.println("car is repaired");
	}
	public static void main(String[] args) {
		wagonr wagonr=new wagonr();//instantiating wagonr class
		audi audi =new audi();//instantiating audi class
		//car car=new car();//it will give error due to usage of abstract keyword
		                    //it doesn't allow that class to be instantiated
		
		repairCar(wagonr);//calling function
		repairCar(audi);//calling function
	}

}
