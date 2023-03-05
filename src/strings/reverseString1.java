package strings;

public class reverseString1 {

	public static void main(String[] args) {
		String str = "rabbar";
		StringBuilder s = new StringBuilder(str); //Take Stringbuilder to modify string
		int n = s.length();
		for(int i=0;i<n/2;i++) {
			char ch = s.charAt(i);
			s.setCharAt(i,s.charAt(n-i-1)); // How to set  character
			s.setCharAt(n-i-1, ch);
		}
		if(str.equals(s))
			System.out.println("true");
	}

}
