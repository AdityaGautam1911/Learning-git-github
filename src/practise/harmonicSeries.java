package practise;
import java.util.*;
public class harmonicSeries {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter--->");
		double n=sc.nextDouble();
		Double result=0.0;
		for(double i=1;i<=n;i++) {
			result+=1/i;
		}
		System.out.println(result);
	}
}
