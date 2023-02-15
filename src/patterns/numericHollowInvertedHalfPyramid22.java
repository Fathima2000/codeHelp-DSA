package patterns;

public class numericHollowInvertedHalfPyramid22 {

	public static void main(String[] args) {
		int n = 6;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<=n;j++) {
				if(i==0 || j==i+1 || j==n) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
