package new1;
public class reverseString {
	public static void main(String[] args) {
		String s="    The sky is blue   ";
		int i=s.length()-1;
		String result="";//creating empty string for printing the reversed string
		while(i>=0) {
			while(i>=0 && s.charAt(i)==' ') {
				i--;//reducing index till last letter of last word is reached
			}
			int j=i; //making index of j fixed at the end for reference
			if(i<0) {
				break;//coming out of the first while loop if 
			}
			while(i>=0 && s.charAt(i)!=' ') {
				i--;
			}
			if(result.isEmpty()) {
				result=result.concat(s.substring(i+1,j+1));
			}else {
				result=result.concat(" "+s.substring(i+1,j+1));
			}
			
		}
		System.out.println(result);
	}
}
