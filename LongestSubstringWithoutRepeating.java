import java.util.*;

public class LongestSubstringWithoutRepeating {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(lengthofLargestSubstring(s));
		System.out.println(LengthOfLargestSubstring2(s));
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

	public static int LengthOfLargestSubstring2(String s) {
		HashMap<Character,Integer> ansMap = new HashMap<Character,Integer>();
		int left = 0,right = 0;
		int n = s.length();
		int length = 0;
		while(right<n) {
			if(ansMap.containsKey(s.charAt(right))){
				left = Math.max(ansMap.get(s.charAt(right))+1,left);
			}
			else {
				ansMap.put(s.charAt(right),right);
			}
			length = Math.max(length,right-left+1);
			right++;
			
		}
		return length;
	}

}
