package searching;

public class totalNoOfOccurence4 {
	
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
	
	public static int lastOcc(int arr[], int target) {
		int start = 0;
		int end = arr.length-1;
		int ans = -1;
		
		while(start<=end) {
			int mid = start + (end-start)/2;
			
			if(target==arr[mid]) { 
				ans = mid;  //Store ans & do right search
				start = mid+1;	
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
		  int target = 7;

		  int ans1 = lastOcc(arr, target);		  
		  int ans2 = firstOcc(arr, target);
		  
		  if(ans1==-1) {
			  System.out.println("Not found");
		  }
		  else {
			  System.out.println(ans1-ans2+1);
		  }
	}

}
