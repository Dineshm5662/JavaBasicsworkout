package worksession2;

public class Upperlowercase {
  /*	3. Write a java program to find the number of Uppercase, lowercase, numbers and spaces in the following String.
	Input: "1. It is Work from Home  not Work for Home"
	- Character class
	- ascii
	- regex*/

	public static void main(String[] args) {
		
		// Approaching with Character class  
		
				String str = "1. It is Work from Home  not Work for Home"; 
				
				int upper = 0; 
				int lower = 0;
				int number = 0;  
				int space = 0; 
				
				char[] chArray = str.toCharArray(); 
				
				// Iterating in for loop on each char 
				for(int i = 0; i < chArray.length; i++) {
					if (chArray[i] == ' ') {
						space = space + 1; 
					} else if (Character.isUpperCase(chArray[i])) { 
						upper = upper + 1; 
					} else if (Character.isLowerCase(chArray[i])) { 
						lower = lower + 1; 
					} else if (Character.isDigit(chArray[i])) {
						number = number + 1; 
					}
				}
				
				System.out.println("Number of Spaces: " + space); 
				System.out.println("Number of Uppercases: " + upper); 
				System.out.println("Number of Lowercases: " + lower); 
				System.out.println("Number of Numeric: " + number); 

	}

}
