import java.util.*;

public class IterativePermutation {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		solution(str);
	}

	public static void solution(String str) {
		int n = str.length();
		int f = factorial(n);
		for (int i = 0; i < f; i++) {
			StringBuilder sb = new StringBuilder(str);
			int temp = i;
			for (int div = n; div >= 1; div--) {
				int quo = temp / div;
				int rem = temp % div;
				System.out.print(sb.charAt(rem));
				sb.deleteCharAt(rem);
				temp = quo;
			}
			System.out.print(", ");
		}
	}

	public static int factorial(int n) {
		int val = 1;
		for (int i = 2; i <= n; i++) {
			val *= i;
		}
		return val;
	}
}
