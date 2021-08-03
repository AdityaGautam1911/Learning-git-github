package exceptionHandling;

public class mainClass {

	public static void main(String[] args) {
		try {
			int a=5;
			int b=0;
			int c=a/b;//throwing the exception
			          //this will give error since can't divide by 0
		}catch(ArithmeticException e){//catching the exception
			System.out.println(e.getMessage()+" error occured,please chek code");
		}finally {
			System.out.println("sorry for the inconvenience");//this will run no matter what
		}
		System.out.println("");
		System.out.println("this message will still get displayed even if error occurs");
		System.out.println("this is due to try and catch exception handling,without this,");
		System.out.println("the code would have stopped completely");
		

	}

}
