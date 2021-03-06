package worksession2;

public class Reversewords {
	
	/*2. Write a java program to do the following.
	Input: "When the world realise its own mistakes, corona will dissolve automatically"
	output: "When eht world esilaer its nwo mistakes, anoroc will evlossid automatically"
	- Iterate and even digit will be reverse looped*/

	public static void main(String[] args) {
		

		// This program is to reverse the words in a sentence which are in even position 
		
		// Iterate and even digit will be reverse looped 
		
		String str = "When the world realise its own mistake, corona will dissolve automatically"; 
		
		String[] split = str.split(" "); 
		
		for (int i = 0; i < split.length; i++) { 
			// Checking from 2nd position onwards  
			if (i%2 != 0) { 
				// if not the 1st 3rd position then reverse the word 
				split[i] = new StringBuilder(split[i]).reverse().toString(); 
			}
				
		} 
		
		StringBuilder revBuild = new StringBuilder(); 
		
		for (String s : split) {
			revBuild.append(s + " "); 
		} 
		
		System.out.println("Original: " + str);
		System.out.println("Reversal: " + revBuild);

	}

}

