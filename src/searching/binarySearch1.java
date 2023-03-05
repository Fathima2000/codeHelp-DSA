package searching;

public class binarySearch1 {
	
		public static int binarySearch(int arr[], int size, int target) {
			int start = 0;
			int end = arr.length-1;
			while(start<=end) {
				int mid = start + (end-start)/2;
				
				if(target==arr[mid])
					return mid;
				
				else if(target>arr[mid]) {
					start = mid+1;
				}
				else {
					end = mid-1;
				}
			}
			return -1;
		}


	public static void main(String[] args) {
		  int arr[] = {1,2,3,4,5,6,7,8};
		  int size = 8;
		  
		  int res = binarySearch(arr, size, -100);
		  if(res!=-1) {
			  System.out.println(res);
		  }
		  else {
			  System.out.println("Not Found");
		  }


	}

}
