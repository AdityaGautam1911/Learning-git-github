import java.util.Scanner;
public class fibonacci {
	public static void main(String[] args) {
	System.out.println("enter number here--->");
	Scanner scan=new Scanner(System.in);
	int n = scan.nextInt();
	int a=0;
	int b=1;
	System.out.print(a+" ");
	System.out.print(b+" ");
	for(int i=0 ; i<=n-2 ; i++){
		int c=a+b;
		System.out.print(c+" ");
		a=b;
		b=c;
		}
	
	}
}