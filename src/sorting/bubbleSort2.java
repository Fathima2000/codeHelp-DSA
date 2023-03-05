package sorting;

public class bubbleSort2 {

	public static void main(String[] args) {
		int arr[] = {3,2,7,4,0};
		int n = arr.length;
		
//		for(int i=0;i<n-1;i++) {
//			for(int j=0;j<n-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					int tmp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = tmp;
//				}
//			}
//		}
		
		//OPTIMIZED		
		for(int i=0;i<n-1;i++) {
			boolean swapped = false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swapped = true;
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
				if(swapped==false) {
					break;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}


	}

}
