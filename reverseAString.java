import java.util.*;
public class reverseAString {
public static void main(String args[]) {
	Scanner sc =  new Scanner(System.in);
	String s = sc.nextLine();
	
	//first Method
	
	StringBuilder sb = new StringBuilder();
	sb.append(s);
	sb.reverse();
	System.out.println(sb.toString());
	
	
	//Second Method
	
	String rev = "";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev = rev+s.charAt(i);
	}
	System.out.println(rev);
	
	}
}
