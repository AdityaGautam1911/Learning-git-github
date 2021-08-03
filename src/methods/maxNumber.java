package methods;
import java.util.Scanner;
public class maxNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number--->");
		int first=scan.nextInt();
		System.out.println("enter second number--->");
		int second=scan.nextInt();
		int result=maxOf(first,second);//function call
		System.out.println(result);//function print
		System.out.println(maxOf(1,2));
	}
	static int maxOf(int a,int b) {//this method is made outside public static void main(String[] args){

		if(a>b) {
			return a;
		}else {
			return b;
		}
	}

}
