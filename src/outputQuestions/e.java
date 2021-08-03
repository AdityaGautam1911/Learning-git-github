package outputQuestions;

public class e {

	public static void main(String[] args) {
		int i = 0, j = 9; 
        do { 
            i++; 
            if (j-- < i++) { 
                break; 
            } 
        } while (i < 5); 
          System.out.println(i + "" + j); 

	}

}
//In the above program, we have to specially take care about 
//the break statement. The execution of the program is going as 
//usual as the control flow of do-while loop but whenever compiler
//encountered break statement its control comes out from the loop