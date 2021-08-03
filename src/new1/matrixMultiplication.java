package new1;
import java.util.Scanner;
public class matrixMultiplication {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		//creating and adding to array 'a'
		System.out.println("enter no. of rows");
		int rows_a=scan.nextInt();
		System.out.println("enter no. of columns");
		int cols_a=scan.nextInt();
		int a[][]=new int [rows_a][cols_a];
		for(int i=0;i<rows_a;i++) {
			for(int j=0;j<cols_a;j++) {
				System.out.println("enter values--->");
				a[i][j]=scan.nextInt();
			}
		}
		
		//creating and adding to array 'b'
		System.out.println("enter no. of rows");
		int rows_b=scan.nextInt();
		System.out.println("enter no. of columns");
		int cols_b=scan.nextInt();
		int b[][]=new int [rows_b][cols_b];
		for(int i=0;i<rows_b;i++) {
			for(int j=0;j<cols_b;j++) {
				System.out.println("enter values--->");
				b[i][j]=scan.nextInt();
			}
		}
		
		int c[][]=new int[rows_a][cols_b];  
		
		for(int i=0;i<rows_a;i++){    
			for(int j=0;j<cols_a;j++){    
			c[i][j]=0;      
			for(int k=0;k<rows_a;k++)      
			{      
			c[i][j]+=a[i][k]*b[k][j];      
			}//end of k loop  
			System.out.print(c[i][j]+" ");  //printing matrix element  
			}//end of j loop  
			System.out.println();//new line    
		}
		
		
	}

}
