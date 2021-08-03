//input number till 0 is entered//
package new1;
import java.util.Scanner;
public class doWhileLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=1;
		do {
			System.out.println("please enter--->");
			n=scan.nextInt();
			System.out.println(n);
		}while(n!=0);
	}
}