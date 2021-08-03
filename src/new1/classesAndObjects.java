package new1;
class dog{ //creating a class named dog
	String breed,name; //creating two empty strings
	public void jump() {
		System.out.println("my dog "+name+" jumped");
	}
	public void description() {
		System.out.println("my dog's name is "+name+" and its breed is "+breed);
	}
}
public class classesAndObjects {
	public static void main(String[] args) {
		dog husky=new dog(); //creating new object "husky"
		dog poodle=new dog(); //creating new object "poodle"
		
		husky.breed="husky";
		husky.name="Browny";
		
		poodle.breed="poodle";
		poodle.name="Tommy";
		
		husky.jump();
		husky.description();
		
		poodle.jump();
		poodle.description();
	}

}
