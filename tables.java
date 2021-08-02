public class tables {
    public static void main(String[] args){
        System.out.println("############### THIS IS A MULTIPLICATION TABLE ###############");
		System.out.println("   ");
		int tableOf=1;
		for(int j=1;j<=10;j++) {
			for(int i=1;i<=10;i++) {
				System.out.print(tableOf*i+" ");
				
			}
			System.out.println(" ");
			tableOf+=1;
		}
    }
    
}
