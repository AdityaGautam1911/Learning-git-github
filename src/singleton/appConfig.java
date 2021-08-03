package singleton;
public class appConfig {
	private appConfig() {
		
	}
	private static appConfig object=null;//private object can only be accessed within this(appConfig) class
	public static appConfig getInstance(){
		if(object==null) {               //this if statement creates object only when needed ie-when called
			object=new appConfig();      //this reduces ram/time unnecessarily if not called
		}
		return object;
	}
}
