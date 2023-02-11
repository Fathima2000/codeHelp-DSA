package patterns;

public class flippedSolidDiamond16 {

	public static void main(String[] args) {
		int n = 5;
		
		// Upper half
		for(int i=0;i<n;i++) {
			//Half pyramid
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			
			//space full pyramid
			for(int j=0;j<2*i+1;j++) {
				System.out.print(" ");
			}
			
			//Half pyramid
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		// Lower half
		for(int i=0;i<n;i++) {
			//Half pyramid
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			
			//space full pyramid
			for(int j=0;j<2*n-2*i-1;j++) {
				System.out.print(" ");
			}
			
			//Half pyramid
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}			
			System.out.println();
		}
		
	}

}
