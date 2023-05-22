package recursion;

import java.util.ArrayList;
import java.util.List;

public class delete {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};		
		List<String> ans = new ArrayList<>();
		solve(arr);
	}
	
	private static void solve(int[] arr) {
		for(int start=0; start<arr.length; start++) {
			int end = start;
			solve_util(arr,arr.length,start,end);
		}
	}

	private static void solve_util(int[] arr, int n, int start, int end) {
		if(end==n) {
			return;
		}
		for(int i=start;i<=end;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		solve_util(arr,n,start,end+1);
	}
	

}