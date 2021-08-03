//using 1 array
package anagram;
public class optimisedAnagram2 {
	public static void main(String args[]) {
		String a="cat";
		String b="act";
		boolean isAnagram=true; //to check if anagram or not
		int a1[]=new int[256];//creating 1 new array,,256 since keyboard have 256 characters
		for(char c:a.toCharArray()) { //toCharArray splits the String and puts them to an array 
			                          //then we pick elements from that array one by one
			int index=(int) c; //int(c) converts character c into its ascii value
			a1[index]++; //incrementing no. of characters corresponding to its ascii value
		}
		for(char c:b.toCharArray()) { //toCharArray splits the String and puts them to an array 
                                      //then we pick elements from that array one by one
			int index=(int) c;
			a1[index]--;
		}
		for(int i=0;i<256;i++) { //equating both arrays and making isAnagram false if arrays are not equal
			if(a1[i]!=0) {
				isAnagram=false;
				break;
			}
		}
		if(isAnagram) {
			System.out.println("ANAGRAM");
		}else {
			System.out.println("NOT ANAGRAM");
		}
	}

}
