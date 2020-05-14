package worksession;

public class Reverse1 {

	public static void main(String[] args) {
		String str = "malayalam";
        String rev ="";
        for (int i = str.length()-1 ; i>=0; i--) {
			rev  +=str.charAt(i);
		}
        System.out.println(str.equals(rev)?"Yes,palindrome":"no,not a palindrome");
	}

}
