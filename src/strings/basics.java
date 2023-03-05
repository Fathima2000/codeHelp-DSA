package strings;

import java.util.Scanner;

public class basics {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[] ch = new char[5];
		
		//At the end of character array -> null terminator will b there('\0')
		
		// this will not take space, next line, tab		
//		ch = sc.next().toCharArray();
		
		ch = sc.nextLine().toCharArray();
		
		System.out.println(ch.length);
		
		System.out.println(ch);

	}

}
