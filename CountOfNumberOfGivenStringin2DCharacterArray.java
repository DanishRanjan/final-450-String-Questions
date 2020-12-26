import java.util.*;

public class CountOfNumberOfGivenStringin2DCharacterArray {
public static void main(String args[]) {
	String s = "GEEKS"; 
	char ch[][] =
		{
			{'D','D','D','G','D','D'},
			{'B','B','D','E','B','S'},
			{'B','S','K','E','W','K'},
			{'B','D','D','D','D','E'},
			{'D','D','D','D','D','E'},
			{'D','D','D','D','D','G'}
					
		};
	int ans = 0;
	int size = 5;
	for(int i=0;i<6;i++) {
		for(int j=0;j<6;j++) {
			ans = ans+solve(i,j,s,ch,size,0);
		}
	}
	System.out.println(ans);
}

public static int solve(int i, int j, String s,char[][] ch,int size, int index) {
	int found = 0;
	if( i >= 0 && j >= 0 && i < 6 && j < 6 && s.charAt(index)==ch[i][j]) {
		char temp = s.charAt(index);
		ch[i][j] = 0;
		index = index+1;
		if(index==size) {
			found = 1;
		}
		else {
			found = found+solve(i+1,j,s,ch,size,index);
			found = found+solve(i-1,j,s,ch,size,index);
			found = found+solve(i,j+1,s,ch,size,index);
			found = found+solve(i,j-1,s,ch,size,index);
		}
		ch[i][j] = temp;
	}
	return found;
}
}

   



