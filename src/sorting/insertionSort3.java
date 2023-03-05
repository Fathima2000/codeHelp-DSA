package sorting;

public class insertionSort3 {

	public static void main(String[] args) {
		
		int arr[] = {3,2,7,4,0};
		int n = arr.length;
		
		for(int i = 1; i < n; i++) {
		      //Step A - fetch
		      int val = arr[i];
		      //StepB: Compare
		      int j;
		      for(j=i-1; j>=0; j--) {
		          if(arr[j] > val) {
		              // Step C: shift
		              arr[j+1] = arr[j];
		          }
		          else {
		              //rukna hai
		              break;
		          }

		      }
		      //stepD: Copy
		      arr[j+1] = val;
		  }

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
