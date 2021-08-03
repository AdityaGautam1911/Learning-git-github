package new1;
import java.util.Scanner;
public class palindrome_and_reverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter--->");
		int n=scan.nextInt();
		int temp=n;
		int reverse=0;
		while(temp>0) {
			int lastDigit=temp%10;
			reverse=reverse*10+lastDigit;
			temp/=10;
		}
		if(reverse==n) {
			System.out.println(" is a PALINDROME");
		}else {
			System.out.println(" is not a PALINDROME");
		}
	}
}