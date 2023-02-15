package patterns;

public class solidHalfDiamond24 {

	public static void main(String[] args) {
		int n = 5;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<=i;j++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<=n-i-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		for(int i=0;i<2*n-1;i++) {
			int k = (i<n)?i:n-(i%n)-2;
			for(int j=0;j<=k;j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
