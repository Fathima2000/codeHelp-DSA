package sorting;

public class selectionSort1 {

	public static void main(String[] args) {
		int arr[] = {3,2,7,4,0};
		
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int minIndex = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = tmp;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
