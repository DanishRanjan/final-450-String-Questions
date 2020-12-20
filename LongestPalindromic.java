import java.util.*;
public class LongestPalindromic {
public static void main(String args[]) {
	Scanner sc =  new Scanner(System.in);
	int tc = sc.nextInt();
	while(tc-->0) {
		String s = sc.next(); 
		longestpal(s);
	}
}
public static void printString(String s, int start, int palindromeSizeTillYet) {
	for(int i=start;i<=palindromeSizeTillYet;i++) {
		System.out.print(s.charAt(i));
	}
}
public static void longestpal(String s) {
	int low,high;
	int start = 0;
	int palindromeSizeTillYet = 1;
	for(int i=1;i<s.length();i++) {
		
		low = i-1;
		high=i;
		
		//even substring
		while(low>=0 && high<s.length()&& s.charAt(low)==s.charAt(high)) {
			if(high-low+1>palindromeSizeTillYet) {
				start = low;
				palindromeSizeTillYet = high-low+1;
			}
			low--;
			high++;
		}
		
		
		//odd substring
		low = i-1;
		high=i+1;
		
		
		while(low>=0 && high<s.length()&& s.charAt(low)==s.charAt(high)) {
			if(high-low+1>palindromeSizeTillYet) {
				start = low;
				palindromeSizeTillYet = high-low+1;
			}
			low--;
			high++;
		}
		
	
	}
		printString(s, start, start+palindromeSizeTillYet-1);
		System.out.println();
}
}