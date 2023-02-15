package array;

import java.util.Scanner;

public class sort0sAnd1s4 {
	
	private static void sortFunction(int arr[], int n){
		int i = 0;
		int low = 0, high = n-1;
		while(low<high) {
			if(arr[i]==0) {
				int tmp = arr[i];
				arr[i] = arr[low];
				arr[low] = tmp;
				i++;
				low++;
			}
			else {
				int tmp = arr[i];
				arr[i] = arr[high];
				arr[high] = tmp;
				high--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		sortFunction(arr,n);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}

	}

}
