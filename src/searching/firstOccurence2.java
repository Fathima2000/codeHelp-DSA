package searching;

public class firstOccurence2 {
	
	public static int firstOcc(int arr[], int target) {
		int start = 0;
		int end = arr.length-1;
		int ans = -1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(target==arr[mid]) { 
				ans = mid;  //Store ans & do left search
				end = mid-1;		
			}
				
			
			else if(target>arr[mid]) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return ans;
	}

	
	public static void main(String[] args) {
		  int arr[] = {1,3,3,3,3,3,3,4,4,4,4,6,7};
		  int target = -100;

		  int ans = firstOcc(arr, target);
		  System.out.println(ans);

	}

}
