package new1;
import java.util.Scanner;
public class avgMarks {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter no. of students--->");
		int n=scan.nextInt();
		int marks[]=new int[n];
		int average=0;
		for(int i=0;i<n;i++) {
			System.out.println("enter marks--->") ;
			marks[i]=scan.nextInt();
		}
		for(int j=0;j<n;j++) {
			average+=marks[j];
		}
		average/=n;
		System.out.println(average);
		}
		
	}



