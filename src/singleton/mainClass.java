package singleton;
public class mainClass {
	public static void main(String[]args){
		appConfig obj1=appConfig.getInstance();//no matter how many objects we create
		appConfig obj2=appConfig.getInstance();//we do not create new instance every time
		appConfig obj3=appConfig.getInstance();//we just access the single object created in the appConfig 
		appConfig obj4=appConfig.getInstance();//ie-we access the getInstance() function
	}
}
