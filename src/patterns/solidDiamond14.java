package patterns;

public class solidDiamond14 {

	public static void main(String[] args) {
		int n = 8;
		
		// Full pyramid
		for(int i=0;i<n;i++) {
			
			//Print space
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			
			//Print *
			for(int j=0;j<=i;j++) {
				System.out.print("*" + " ");
			}
			
			System.out.println();
		}
		
		//Inverted full 
		for(int i=0;i<n;i++) {
			
			//Print space
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			
			//Print *
			for(int j=0;j<n-i;j++) {
				System.out.print("*" + " ");
			}
			
			System.out.println();
		}

	}

}
