package strings;

public class palindromeString2 {
	
	public static boolean palindrome(String str) {
		int n = str.length();
		for(int i=0;i<n/2;i++) {
			char ch1 = str.charAt(i);
			char ch2 = str.charAt(n-i-1);
			if(ch1 == ch2) //Equals sign exists
				continue;
			else
				return false;
		}
		return true;
	}
	
	

	public static void main(String[] args) {
		String str = "rabbar";
		System.out.println(palindrome(str));	}
}
