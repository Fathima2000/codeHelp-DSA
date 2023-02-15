package patterns;

public class numericHollowHalfPyramid21 {

	public static void main(String[] args) {
		int n = 6;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				if(j==0 || i==n-1 || j==i) {
					System.out.print(j+1);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
