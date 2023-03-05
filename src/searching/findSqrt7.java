package searching;

public class findSqrt7 {

	public static int findSqrt(int n) {
		  int target = n;
		  int s = 0;
		  int e = n;
		  int mid = s + (e-s)/2;
		  int ans = -1;

		  while(s <= e) {
		    if(mid*mid == target) {
		      return mid;
		    }


		    if(mid*mid > target) {
		      //left search
		      e = mid - 1;
		    }
		    else {
		      //ans store
		      ans = mid;
		      //right search
		      s = mid+1;
		    }
		    mid = s + (e-s)/2;
		  }
		   return ans;

		}

	
	public static void main(String[] args) {
		   int n = 10;
		  double ans = findSqrt(n);
		  System.out.println("Ans is "+ans);
		  
		  int precision = 3;
		  double increment = 0.1;
	        for (int i = 0; i < precision; i++) {
	            while (ans * ans <= n) {
	                ans += increment;
	            }
	 
	            // loop terminates when ans * ans > number
	            ans = ans - increment;
	            increment = increment / 10;
	        }
	        System.out.println((float)ans);


	}

}
