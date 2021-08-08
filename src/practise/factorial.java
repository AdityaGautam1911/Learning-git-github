package practise;
import java.util.Scanner;
public class factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter--->");
		int n=sc.nextInt();
		int fact=1;
		if(n==0) {
			System.out.println("factorial is------>1");
		}else {
			for(int i=1;i<=n;i++) {
				fact*=i;
			}
		}
		System.out.println(fact);
		
	}
}
