import java.util.*;
public class DuplicateInString {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String s  = sc.nextLine();
	countDuplicateCharacter(s);
}
public static void countDuplicateCharacter(String str) {
	Map<Character,Integer> ans = new HashMap<>();
	
	//converting string into char array
	char[] charArray = str.toCharArray();
	
	//Iterating through each element and checking if it's present in HashMap or not, if its present then increase the count and if not present
	//then add it into HasMap and give it a value of 1
	for(char c: charArray) {
		if(ans.containsKey(c)) {
			ans.put(c, ans.get(c)+1);
		}
		else {
			ans.put(c, 1);
		}
	}
	
//	after filling each and every element and its value in HashMap , now we are iterating HashMap from starting to get the answer
	for(Map.Entry<Character, Integer> entry: ans.entrySet()) {
//	for (Map.Entry entry : ans.entrySet()) {
		if(entry.getValue()>1) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
	
}
}
