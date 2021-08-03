import java.util.Scanner;
public class pattern4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter number--->");
		int n=scan.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}

	}

}
