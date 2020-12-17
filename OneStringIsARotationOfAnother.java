import java.util.*;
public class OneStringIsARotationOfAnother {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();
	String s2 = sc.nextLine();
	if(s1.length()!=s2.length() ) {
		System.out.println("length is not same");
	}
	else {
		if(s1.length()==s2.length() && (s1+s1).indexOf(s2)==1) {
			System.out.println("yes, it is a rotation");
		}
		else {
			System.out.println("no it is not");
		}
	}
	
  }
}
