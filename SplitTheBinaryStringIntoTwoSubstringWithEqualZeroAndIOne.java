import java.util.*;
public class SplitTheBinaryStringIntoTwoSubstringWithEqualZeroAndIOne {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	int n = str.length();
	System.out.println(maxSubStr(str, n));
}
public static int maxSubStr(String s, int n) {
	int count0 = 0;
	int count1 = 0;
	int noOfPair = 0;
	for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='0') {
			count0++;
		}
		else {
			count1++;
		}
		if(count0==count1) {
			noOfPair++;
		}
	}
	if (count0 != count1)  
    { 
        return -1; 
    } 
    return noOfPair;
}
}
