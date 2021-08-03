import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
	    System.out.println("enter number");
	    int x = scan.nextInt();
	         
	    int fact = 1;
	    for(int i=1;i<=x;i++){
	    	fact=fact*i;
	    }
	    System.out.println(fact);
	}	
}