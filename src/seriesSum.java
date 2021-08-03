////print sum of series 1/1+1/2+1/3+1/4+---1/n
//import java.util.Scanner;
//public class seriesSum {
//
//	public static void main(String[] args) {
//		Scanner scan=new Scanner(System.in);
//		System.out.println("please enter a number");
//		double n=scan.nextDouble();
//		double result=0;
//		for(double i=1;i<=n;i++){
//			result+=1/i;
//		}
//		System.out.println(result);
//	}
//}

//print sum of series 1/1-1/2+1/3-1/4+.......1/n
import java.util.Scanner;
public class seriesSum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number");
		double n=scan.nextDouble();
		double result=0;
		for(double i=1;i<=n;i++){
			result+=1/i;
		}
		System.out.println(result);
	}
}

