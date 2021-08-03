package practise;
import java.util.Scanner;
public class removingDecimal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter--->");
		String input=sc.nextLine();
		input.trim();
		int a=input.indexOf(".");
		String result=input.replace('.',' ');
		for(int i=0;i<input.length();i++) {
			System.out.println(result);
		}
	}
}
