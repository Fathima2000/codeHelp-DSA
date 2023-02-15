package array;

import java.util.Scanner;

public class printExtremesInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int i=0, j=n-1;
		while(i<=j) {
			System.out.print(arr[i]+" ");
			if(i!=j)
				System.out.print(arr[j]+" ");
			i++;j--;
		}
	}

}
