import java.util.*;
public class StringCompression {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}
	public static String compression1(String str) {
		String ans = str.charAt(0)+"";
		for(int i=1;i<str.length();i++) {
			char currentCharacter = str.charAt(i);
			char previouCharacter = str.charAt(i-1);
			if(currentCharacter != previouCharacter) {
				ans = ans+currentCharacter;
			}
		}
		return ans;
	}
	public static String compression2(String str) {
		String ans = str.charAt(0)+"";
		int count = 1;
		
		for(int i=1;i<str.length();i++) {
			char currentCharacter = str.charAt(i);
			char previouCharacter = str.charAt(i-1);
			if(currentCharacter == previouCharacter) {
				count++;
			}
			else {
				if(count>1) {
					ans = ans+count;
					count=1;
				}
				ans = ans+currentCharacter;
			}
		}
		if(count>1) {
			ans = ans+count;
			count=1;
		}
		return ans;
	}

}
