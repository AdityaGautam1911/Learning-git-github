package outputQuestions;

public class a {

	public static void main(String[] args) {
		int x = 0;
	    int y = 0;
	    for (int z = 0; z < 5; z++)
	    {
	        if((++x > 2) || (++y > 2))//x incremented 5 times here
	        {                         //y incremented 2 times since after first two iterations x++>2 is true therefore y+=>2 is not evaluated thereafter 
	        	
	        	
	           x++;//x incremented 3 times here
	        }
	    }
	       System.out.println( x + " " + y);

	}

}
