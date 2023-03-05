package searchingAndSorting;

public class firstOccurence2 {

	public static int firstOcc(int arr[], int target) {
		  int s = 0;
		  int e = arr.length - 1;
		  int mid = s + (e-s)/2;
		  int ans = -1;

		  while(s <= e) {
		    if(arr[mid] == target) {
		      //ans store
		      ans = mid;
		      //left search
		      e = mid - 1;
		    }
		    else if(target < arr[mid] ) {
		      //left me search
		      e = mid - 1;
		    }
		    else if(target > arr[mid] ) {
		      //right search
		      s = mid + 1;
		    }
		    mid = s + (e-s)/2;
		  }
		  return ans;
		}

	
	public static void main(String[] args) {
		  int arr[] = {1,3,3,3,3,3,3,4,4,4,4,6,7};
		  int target = 4;

		  int ans = firstOcc(arr, target);
		  System.out.println(ans);

	}

}
