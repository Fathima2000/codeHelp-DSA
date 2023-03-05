package searching;

public class fingPivotElementHighest6 {
	
	
	public static int findPivot(int arr[]) {
	    int s = 0;
	    int e = arr.length - 1;
	    int mid = s + (e-s)/2;

	    while(s < e) {
	    	//Below both are breaking conditions
	        if(mid+1 < arr.length && arr[mid] > arr[mid+1])
	        return mid;
	        if(mid-1 >= 0 && arr[mid-1] > arr[mid])
	        return mid-1;

	        if(arr[s] >= arr[mid]) //Search in left
	        e = mid - 1;
	        else					//Search in right
	        s = mid ;
	        
	        mid = s + (e-s)/2;
	    }
	    return s;
	    }

	public static void main(String[] args) {
		int arr[] = {0,2,10,5};
		System.out.println(findPivot(arr));

	}

}
