package worksession;

public class Reverse2 {

	public static void main(String[] args) {
		String str = "malayalam";
        StringBuffer stb =new StringBuffer(str);
        String rev = stb.reverse().toString();
        if (rev.equals(str)) {
           System.out.println("Yes,palindrome");
		}
        else {
        	System.out.println("No, Not a palindrome");
        }
        }

}
