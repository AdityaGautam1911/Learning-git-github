import java.util.Scanner;
public class pattern5{
	public static void main(String arrgs[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter--->");
		int n = scan.nextInt();
		System.out.println("*"); //FOR FIRST LINE
		
		
		//for pattern in between
		for(int i=2;i<=n-1;i++) {
			System.out.print("*");
			for(int j=1;j<=i-2;j++) {
				System.out.print(" ");
			}
			System.out.print("* ");
			System.out.println();
		}	
		for(int i=1;i<=n;i++) {  //FOR LAST LINE
			System.out.print("*");
		}
	}
}
