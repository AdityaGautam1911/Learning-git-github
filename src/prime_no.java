import java.util.Scanner;
public class prime_no {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter number--->");
		int n=scan.nextInt();
		boolean isPrime=true;
		for(int i=2;i*i<=n;i++) {
			if(n%2==0){
				isPrime=false;
				break;
			}
		}
		if(n<2){
			isPrime=false;
		}
		System.out.println(n+" isPrime  "+isPrime);

	}
}
