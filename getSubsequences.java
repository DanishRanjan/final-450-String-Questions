import java.util.*;
public class getSubsequences {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	System.out.println(getSS(s));
}
public static ArrayList<String> getSS(String str){
	if(str.length()==0) {
		ArrayList<String> baseCase = new ArrayList<>();
		baseCase.add("");
		return baseCase;
	}
	char cc = str.charAt(0);
	String ros = str.substring(1);
	ArrayList<String> myResult = new ArrayList<>();
	ArrayList<String> recResult = getSS(ros);
	for(int i=0;i<recResult.size();i++) {
		myResult.add(recResult.get(i));
		myResult.add(cc+recResult.get(i));
	}
	return myResult;
}
}
