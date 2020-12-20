import java.util.*;

public class LongestSubstringWithoutRepeating {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(lengthofLargestSubstring(s));
	}

	public static int lengthofLargestSubstring(String s) {
		int a_pointer = 0;
		int b_pointer = 0;
		int max = 0;
		HashSet<Character> hash_set = new HashSet<>();
		while (b_pointer < s.length()) {
			if (!hash_set.contains(s.charAt(b_pointer))) {
				hash_set.add(s.charAt(b_pointer));
				b_pointer++;

				max = Math.max(hash_set.size(), max);
			} else {
				hash_set.remove(s.charAt(a_pointer));
				a_pointer++;
			}

		}
		return max;
	}
}
