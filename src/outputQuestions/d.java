package outputQuestions;

public class d {

	public static void main(String[] args) {
		int a = 20, b = 10, c = 5;
        if((a >> 1 == b) && (b << 1 == a)) {  // line 1
          System.out.print("Possible");
        }else {
          System.out.print("Not Possible");

        }
	}
}
//in line 1 the if condition evaluates bitwise right shift 
//and left shift on a and b. 1 bit right shift on a 
//decreases its value to 10 i.ie. 20/2. 1 bit left shift on 
//b increases its value two times to 20 i.e. 10*2