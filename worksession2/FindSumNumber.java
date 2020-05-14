package worksession2;

public class FindSumNumber {
 
	/*1. Write a java code to find the sum of the given numbers
	Input: "asdf1qwer9as8d7"
	output: 1+9+8+7 = 25
	- ascii 
    - regex
    - Character class*/
	
	public static void main(String[] args) {
		
		// Program to get the sum of digits from a given string 
		
				String str = "asdf1qwer9as8d7"; 
				
				// First extracting the numbers from the string 
				String numStr = str.replaceAll("\\D", ""); 
				
				// Converting the above string to integer 
				int num = Integer.parseInt(numStr); 
				System.out.println("Extracted number: " + num); 
				
				int sum = 0; 
				
				// Adding the sum of digits 
				while (num != 0) {
					sum = sum + num % 10; 
					num = num/10;  
				} 
				
				System.out.println("Sum of the given digits: " + sum); 
	}
	
}	

   // ***************method 2*****************

    /*    public static void main1(String[] args) {
	    String str = "asdf1qwer9as8d7";
	    int sum=0;
	    for(int i=0; i<str.length(); i++) {
	    char temp = str.charAt(i);
	    if (Character.isDigit(temp)) {
	        int b = Integer.parseInt(String.valueOf(temp));
	        sum=sum+b;
	    }
	}
	     System.out.println("Sum of numbers:"+sum);
}
}*/










