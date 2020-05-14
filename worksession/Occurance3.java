package worksession;

import java.util.HashMap;

public class Occurance3 {

	public static void main(String[] args) {
		 String str = "You have no choice other than following me!";
		 String replaceStr = str.replaceAll("[^o]", "");
		 System.out.println("occurance of o:"+replaceStr.length());

	}


     //************occurance using hashmap***********

	public static void main1(String[] args) { 
		
      String str = "YOU HAVE NO CHOICE OTHER THAN FOLLOWING ME";
      HashMap<Character, Integer> map = new HashMap<>();
      for (char ch : str.toCharArray()) {
	  if (map.containsKey(ch)) {
		int val = map.get(ch);
		map.put(ch, val + 1);
	    } else {
	 	map.put(ch, 1);
	 }
}
      System.out.println(map);
} 


}
