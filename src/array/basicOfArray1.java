package array;

public class basicOfArray1 {
	
	public static void variableFunction(int n){
		n = 100;
	}
	
	public static void arrayFunction(int arr[]){
		for(int i=0;i<arr.length;i++) {
			arr[i] = arr[i]+1;
		}
	}

	public static void main(String[] args) {
				
		// 0 is stored initially
//		int n = 5;
//		int arr[] = new int[n];		
//		for(int i=0;i<n;i++) {
//			System.out.println(arr[i]);
//		}
		
		// Pass by value-->>Value not changed for variable		
//		int n = 10;
//		variableFunction(n);
//		System.out.println(n);
		
		// Pass by reference-->>arrays value changed
//		int arr[] = {10,11};
//		arrayFunction(arr);
//		System.out.println(arr[0]+" "+arr[1]);
		
	}

}
