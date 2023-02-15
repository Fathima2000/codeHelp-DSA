package array;

public class findUniqueElement3 {
	
	public static int uniqueElement(int arr[], int n) {
		int res = 0;
		for(int i=0;i<n;i++) {
			res = res ^ arr[i];
		}
		return res;
	}
	
	public static void main(String[] args) {
		//Every element occurs twice except 1
		//HOW THIS WORKS
//		The reason this works is because XOR is both associative and commutative, meaning that the order in which the elements are XORed does not matter and that XORing an element with 0 does not change the element. When you XOR an element with another element that is the same, the result will be 0, and when you XOR a value with 0, the result is the value itself. Thus, XORing all elements in the array with each other twice (once in each pair) will cancel each other out, leaving only the unique element.
		
		int n = 5;
		int arr[] = {1,3,5,3,5};
		
		int res = uniqueElement(arr,n);
		
		System.out.println(res);
	}

}
