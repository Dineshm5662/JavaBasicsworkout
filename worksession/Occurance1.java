package worksession;


public class Occurance1 {

	public static void main(String[] args) {

		String str = "You have no choice other than following me!";
		
		int count=0;
		
		char[] array = str.toCharArray();
	
		for (int i = 0; i < array.length; i++) {
			if(array[i]=='o') {
				count= count+1;
			}
		}
		
		System.out.println("occurance of o is :"+ count);
	}
	
}
		
	

