package strings;

import java.util.ArrayList;

public class delete {

	public static void main(String[] args) {
		String str = "abc";
		String ans = "";
		ArrayList<String> lst = new ArrayList<>();
		printSubsequence(str, ans, 0, lst);
		for(String s:lst) {
			System.out.println(s);
		}

	}

	private static void printSubsequence(String str, String ans, int i, ArrayList<String>lst) {
		if(i>=str.length()) {
			lst.add(ans);
			return; 
		}
		
		//exclude
		printSubsequence(str, ans, i+1, lst);
		
		//include
		ans+=str.charAt(i);
		printSubsequence(str, ans, i+1, lst);		
	}

}
