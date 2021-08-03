package new1;
import java.util.Scanner;
public class sumOfDigits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter--->");
		int n=scan.nextInt();
		int temp=n;//created since n will lose its value on going through while loop
		int sum=0;
		while(temp>0) {
			int lastDigit=temp%10;//this will run till 4/10=0(since 0,loop will break)
			temp/=10;
			sum+=lastDigit;
			
		}
		System.out.println("sum of digits of "+n+" is "+sum);
		

	}

}
