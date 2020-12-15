import java.util.*;
public class palindromeCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		if(s.equals(sb.toString())) {
			System.out.println("Yes it is a Palindrome");
		}
		else
			System.out.println("Not Palindrome");
		}

}
