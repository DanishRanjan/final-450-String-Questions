import java.util.*;
public class PrintAllPalindromeSubstring {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	solution(str);
	
}
public static void solution(String str) {
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<=str.length();j++) {
			String currentString = str.substring(i, j);
			if(isPalindrome(currentString)==true) {
				System.out.print(currentString+" ");
			}
		}
	}
}
public static boolean isPalindrome(String str) {
	int i=0;
	int j = str.length()-1;
	while(i<j) {
		if(str.charAt(i)!=str.charAt(j)) {
			return false;
		}else {
			i++;
			j--;
		}
	}
	return true;
}
}
