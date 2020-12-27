import java.util.*;

public class ToggleCase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(toggle(str));
	}

	public static String toggle(String str) {
		StringBuilder sb = new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			char ch = sb.charAt(i);
			if(ch>='a'&& ch<='z') {
				char UCH = (char)(ch-'a'+'A');
				sb.setCharAt(i, UCH);
			}
			else if(ch>='A' && ch<='Z') {
				char LCH = (char)(ch-'A'+'a');
				sb.setCharAt(i, LCH);
			}
		}
		return sb.toString();
		

	}
}
