package searching;

public class findOddOccuringElement11 {
	
	public static int solve(int arr[]) {
		  int s = 0;
		  int e = arr.length - 1;
		  int mid = s + (e-s)/2;

		  while(s <= e) {
		    if(s == e) {
		      //single element
		      return s;
		    }

		    //2 cases -> mid - even or mid - odd
		    if(mid%2 == 0 ) {
		      if(arr[mid] == arr[mid + 1] ) {
		        s = mid + 2;
		      }
		      else {
		        e = mid;
		      }
		    }
		    else {
		        if(arr[mid] == arr[mid-1]) {
		          s = mid + 1;
		        }
		        else {
		          e = mid - 1;
		        }
		    }
		    mid = s + (e-s)/2;
		  }
		  return -1;
		}


	public static void main(String[] args) {
		  int arr[] = {1,1,2,2,2,3,3};
		  int ans = solve(arr);
		  System.out.println("index is " +  ans);
		  System.out.println("value is " +  arr[ans]);

	}

}
