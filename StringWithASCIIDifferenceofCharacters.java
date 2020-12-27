import java.util.*;
public class StringWithASCIIDifferenceofCharacters {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	System.out.println(solution(str));
}
public static String solution(String str) {
	StringBuilder sb = new StringBuilder();
	sb.append(str.charAt(0));
	for(int i=1;i<str.length();i++) {
		char cc = str.charAt(i);
		char pc = str.charAt(i-1);
		int gap = cc-pc;
		sb.append(gap);
		sb.append(cc);
	}
	return sb.toString();
}
}
