package maths;

import java.util.Scanner;

public class formNumberByGivenDigits1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int res = 0;
		for(int i=0;i<n;i++) {
			res = res*10+arr[i];
		}
		
		System.out.println(res);
		
		

	}

}
