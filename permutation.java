import java.util.*;
public class permutation {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	ArrayList<String> ans = getPermutation(s);
	Collections.sort(ans);
	for(int i=0;i<ans.size();i++) {
		System.out.print(ans.get(i)+" ");
	}
}
public static ArrayList<String> getPermutation(String str){
	if(str.length()==0) {
		ArrayList<String> baseCase = new ArrayList<>();
		baseCase.add("");
		return baseCase;
	}
	char cc = str.charAt(0);
	String ros = str.substring(1);
	ArrayList<String> myResult = new ArrayList<>();
	ArrayList<String> recResult = getPermutation(ros);
	for(String rrs:recResult) {
		for(int i=0;i<=rrs.length();i++) {
			String val = rrs.substring(0,i)+cc+rrs.substring(i);
			myResult.add(val);
		}
	}
	return myResult;
}
}
