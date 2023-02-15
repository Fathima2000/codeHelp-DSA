package patterns;

public class numericPalindromeEquilateralPyramid23 {

	public static void main(String[] args) {
		int n = 7;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print(j+1);
			}
			if(i>0) {
				for(int j=i;j>=1;j--) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
	}

}
