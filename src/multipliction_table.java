
public class multipliction_table {

	public static void main(String[] args) {
		System.out.println("############### THIS IS A MULTIPLICATION TABLE ###############");
		System.out.println("   ");
		int tableOf=1;
		for(int j=1;j<=20;j++) {
			for(int i=1;i<=20;i++) {
				System.out.print(tableOf*i+" ");
				
			}
			System.out.println(" ");
			tableOf+=1;
		}

	}
}


