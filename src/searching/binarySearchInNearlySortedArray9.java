package searching;

public class binarySearchInNearlySortedArray9 {
	
	public static  int binarySearch(int arr[], int target) {
		  int s = 0;
		  int e = arr.length - 1;

		  int mid = s + (e-s)/2;

		  while(s<=e) {
		    if(arr[mid] == target)
		      return mid;
		    if(mid-1 >= s && arr[mid-1] == target)
		      return mid-1;
		    if(mid + 1 <= e && arr[mid+1] == target)
		      return mid+1;

		      if(target > arr[mid]) {
		        //right search
		        s = mid + 2;
		      }
		      else {
		        //left search
		        e = mid - 2;
		      }
		      mid = s + (e-s)/2;
		  }
		  return -1;
		}


	public static void main(String[] args) {
		  int arr[] = {10,3,40,20,50,80,70};
		  int target = 70;

		  int ans = binarySearch(arr, target);
		  System.out.println("index of "+ target +" is " +ans);

	}

}
