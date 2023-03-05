package searching;

public class binarySearchIn2DMatrix8 {
	
	public static boolean binarySearch(int arr[][], int rows, int cols, int target) {
		  int s = 0;
		  int e = rows*cols - 1;
		  int mid = s + (e-s)/2;

		  while(s <= e) {
		    int rowIndex = mid/cols;
		    int colIndex = mid%cols;

		    if(arr[rowIndex][colIndex] == target) {
		      System.out.println("Found at " + rowIndex +" " +colIndex); 
		      return true;
		    }

		    if(arr[rowIndex][colIndex] < target) {
		      s = mid +1;
		    }
		    else {
		      e = mid - 1;
		    }
		    mid = s + (e-s)/2;
		  }
		  return false;
		}


	public static void main(String[] args) {
		  int arr[][] = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}, {17,18,19,20}};
		  int rows = 5;
		  int cols = 4;

		  int target = 11;

		  boolean ans = binarySearch(arr,rows,cols, target);

		  if(ans) {
		    System.out.println("Found");
		  }
		  else {
			System.out.println("Not Found");
		  }


	}

}
