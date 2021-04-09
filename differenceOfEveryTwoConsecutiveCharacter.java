import java.io.*;
import java.util.*;

public class differenceOfEveryTwoConsecutiveCharacter {

	public static String solution(String str){
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for(int i=1;i<str.length();i++){
		    char currentCharacter = str.charAt(i);
		    char previousCharacter = str.charAt(i-1);
		    int gap = currentCharacter - previousCharacter;
		    sb.append(gap);
		    sb.append(currentCharacter);
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}