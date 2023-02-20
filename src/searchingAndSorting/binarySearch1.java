package searchingAndSorting;

public class binarySearch1 {
	
	public static int binarySearch(int arr[], int size, int target) {
		  int start = 0;
		  int end = size - 1;

		  int mid = start + (end - start ) / 2;

		  while(start <= end) {
		    int element = arr[mid];

		    if(element == target) {//element found, then return index
		      return mid;
		    }

		    if(target < element) {
		      //search in left
		      end = mid - 1;
		    }
		    else {
		      //search in right
		      start = mid + 1;
		    }

		    mid = start + (end - start ) / 2;

		  }

		  //element not found
		  return -1;

		}


	public static void main(String[] args) {
		  int arr[] = {1,2,7,3,4,5,6,7};
		  int size = 8;
		  
		  int res = binarySearch(arr, size, 7);
		  if(res!=-1) {
			  System.out.println(res);
		  }
		  else {
			  System.out.println("Not Found");
		  }


	}

}
