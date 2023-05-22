package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubsequencesOfString {
	
	private static void subsequences(List<String>ans, String str, int i, String output){
		if(i>= str.length()) {
			ans.add(output);
			return;
		}
		
		//exclude
		subsequences(ans, str, i+1, output);
		
		//include
		subsequences(ans, str, i+1, output+str.charAt(i));
	}

	public static void main(String[] args) {
		String str = "abc";
		List<String> ans = new ArrayList<>();
		String output = "";
		subsequences(ans, str, 0, output);
//		for(List<String> index:ans) {
//			System.out.println(index);
//		}
		System.out.println(ans);	
	}

}
