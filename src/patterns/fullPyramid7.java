package patterns;

public class fullPyramid7 {

	public static void main(String[] args) {
		int n = 10;
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
		
//		for(int i=0;i<n;i++) {
//			int odd = 0;
//			for(int j=0;j<(2*n)-1;j++) {
//				if(j<n-i-1)
//					System.out.print(" ");
//				else if(odd<(2*i)+1) {
//					System.out.print("*");
//					odd++;
//				}
//				else
//					System.out.print(" ");
//			}
//			System.out.println();
//		}
	}
}
