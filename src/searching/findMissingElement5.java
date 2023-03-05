package searching;

public class findMissingElement5 {
	
	static int ans = -1;
	
	public static int missingElement(int arr[], int start, int end) {
		
		while(start<=end && ans==-1) {
			int mid = start + (end-start)/2;
			if(arr[mid+1] - arr[mid] > 1) {
				return arr[mid]+1;
			}
			if(arr[mid] - arr[mid-1] > 1) {
				return arr[mid]-1;
			}
			ans = missingElement(arr, start, mid-1);
			ans = missingElement(arr, mid+1, end);
		}
		
		return ans;		
	}

	public static void main(String[] args) {
		int n = 7;
		int arr[] = {2,3,4,5,6,8,9};
		System.out.println(missingElement(arr, 0, n-1));

	}

}
