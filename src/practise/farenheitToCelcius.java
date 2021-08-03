package practise;
import java.util.Scanner;
public class farenheitToCelcius {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter in farenheit--->");
		double farenheit=sc.nextDouble();
		double celcius=(farenheit-32)/1.8;
		System.out.println(farenheit+" in celcius scale is---> "+celcius);
	}

}
