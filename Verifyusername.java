package worksession2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Verifyusername {

	public static void main(String[] args) {
		String str = "DineshMyilsamy";
		String str1="Dinesh";
		String pattern = "[a-zA-Z0-9._$@]{8,}";
		Pattern compile = Pattern.compile(pattern);
		Matcher matcher = compile.matcher(str);
		System.out.println(matcher.matches());
		Matcher matcher1 = compile.matcher(str1);
		System.out.println(matcher1.matches());


	}

}
