import java.util.*;

public class ConvertaSentenceintoitsEquivalentMobileNumericKeypadSequence {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String arr[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7",
				         "77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };
		System.out.println(printSequence(arr,input));
	}
	 public static String printSequence(String arr[], String input) {
		 String output="";
		 for(int i=0;i<input.length();i++) {
			 if(input.charAt(i)== ' ' ) {
				 output+='0';
			 }
			 else {
				 int positionInarr = input.charAt(i)-'A';
				 output+=arr[positionInarr];
			 }
		 }
		 return output;
	 }
}
