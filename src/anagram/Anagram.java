package anagram;
//normal method
public class Anagram {
	public static void main(String[] args) {
		String a="triangle";//creating two strings 
		String b="integral";//creating two strings
		
		boolean isAnagram=false; //to check if anagram or not
		boolean visited[]=new boolean[b.length()];//this is how new object is created,see the array section
		                                          //creating an array(default of all values in array will be false
		                                          //and we will make the value true one by one 
		
		if(a.length()==b.length()) { //to check for same length
		
			for(int i=0;i<a.length();i++) { //going letter by letter of a=triangle(i=0)
				char c=a.charAt(i); //going letter by letter of a=triangle(c=t)
				for(int j=0;j<b.length();j++) { //going letter by letter of b=integral(j=0)
					if(b.charAt(j)==c && !visited[j]){ //checking if "t" is present anywhere in b=integral
						visited[j]=true; //making the checked value of boolean array from default-false to true
						isAnagram=true; //keeping isAnagram true since the letter from a is found in b
						                //and running this loop to check is all letters from a is present in b
						break;//comes out of this if loop and goes back to 2nd for-loop
					}
				}
				if(!isAnagram) { //this if present in 1st for loop--is isAnagram is false,
					break;       //comes out of this if loop and goes back to 1st for-loop and will continue 
					             //till all the letters have been checked and goes to printing code below
				}
			}
			if(isAnagram) { //if isAnagram is true,print anagram
				System.out.println("anagram"); //if isAnagram is true,print anagram
			}else { //if isAnagram is false,print not anagram
				System.out.println("not anagram"); //if isAnagram is false,print not anagram
			}
		}else { //else of "length check if"
			System.out.println("not anagram"); //else of "length check if"
		}
	}
}
