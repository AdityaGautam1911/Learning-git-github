package new1;
import java.util.Scanner;
public class matrixAddition {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter dimensions[x][y]");
		System.out.println("enter No. of rows--->");
		int rows=scan.nextInt();
		System.out.println("enter No. of columns--->");
		int cols=scan.nextInt();
		
		int a[][]=new int[rows][cols];
		int b[][]=new int[rows][cols];
		
		System.out.println("enter values to array a");
		for(int i=0;i<rows;i++) {//adding values to array a
			for(int j=0;j<cols;j++) {
				System.out.print("enter values to--->"+"["+i+"]"+"["+j+"]");
				a[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("enter values to array b");
		for(int i=0;i<rows;i++) {//adding values to array b
			for(int j=0;j<cols;j++) {//
				System.out.print("enter values to--->"+"["+i+"]"+"["+j+"]");
				b[i][j]=scan.nextInt();
			}
		}
		
		int c[][]=new int[rows][cols];//adding a and b to c
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		//printing result array
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(c[i][j]+" ");
			}
		System.out.println();
		}
		
	}
	
}
