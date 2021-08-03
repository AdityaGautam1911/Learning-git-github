package outputQuestions;

public class b {

	public static void main(String[] args) {
		int x, y = 10, z = 12;

		x = y++ + z++;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}//EXPLAINATION
//As in post increment operator, first the value is assigned and then it is incremented, this statement can be re-written as:
//x = y + z;
//y = y++;
//z = z++;

