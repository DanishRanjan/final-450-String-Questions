import java.util.*;
public class ValidShuffleOrNot {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();
	String s2 = sc.nextLine();
	String ans = sc.nextLine();
	char[] s1a = s1.toCharArray();
	char[] s2a = s2.toCharArray();
	char[] ansa = ans.toCharArray();
	int i = 0 ;
	int j = 0;
	int k = 0;
	int l1 = s1.length();
	int l2 = s2.length();
	int res = ans.length();
	if((l1+l2)!=res) {
		System.out.println("Length did not match");
	}
	else {
		while(k<res) {
			if(i<l1 && s1a[i]==ansa[k]) {
				i++;
				k++;
			}
			else if(j<l2 && s2a[j]==ansa[k]) {
				j++;
				k++;
			}
			else {
				break;
			}
		}
		if(i<l1 || j<l2) {
			System.out.println("Not shuffle");
		}
		else {
			System.out.println("Shuffled");
		}
	}
	
}
}
