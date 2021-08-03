package interfaces;
//we implement interfaces using "implements" keyword
public class person implements student,youtuber {//implementing interfaces in person class
	public static void main(String[] args) {
		person obj=new person();
		obj.study();
		obj.makeVideo();
	}
	public void study() {
		System.out.println("person is studying");
	}
	public void makeVideo() {
		System.out.println("person is making videos");
	}
	
}
