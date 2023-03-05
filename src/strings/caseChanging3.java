package strings;

public class caseChanging3 {
	
	public static String toUpper(String str) {
		StringBuilder s = new StringBuilder(str);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {	//To not convert caps, any other ASCII's
//				a = 97, A = 65
				s.setCharAt(i, (char) (s.charAt(i)-'a'+'A')); //Convert to char,bcoz int type not allowed
			}
				
		}
		return s.toString(); //StringBuilder to String
	}
	
	public static String toLower(String str) {
		StringBuilder s = new StringBuilder(str);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {	//To not convert lowerCase, any other ASCII's
//				a = 97, A = 65
				s.setCharAt(i, (char) (s.charAt(i)-'A'+'a')); //Convert to char,bcoz int type not allowed
			}
				
		}
		return s.toString(); //StringBuilder to String
	}

	public static void main(String[] args) {
//		String str = "BabbAr";
//		String str = "babbar";
		String str = "BBAARR";
		
		System.out.println(toUpper(str));
		System.out.println(toLower(str));
		
		//In built functions
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
	}

}
