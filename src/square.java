import java.util.Scanner;
public class square {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter base--->");
		int base=scan.nextInt();
		System.out.println("please enter power--->");
		int power=scan.nextInt();
		int result=1;
		for(int i=0;i<power;i++) {
			result=result*base;
		}
		System.out.println(result);
	}

}
