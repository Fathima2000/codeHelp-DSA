package patterns;

public class numericInvertedFullPyramid10 {

	public static void main(String[] args) {
		int n = 10;
		for(int i=0;i<n;i++) {
			
			//Print space
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			
			//Print *
			for(int j=0;j<n-i;j++) {
				System.out.print((j+1) + " ");
			}
			
			System.out.println();
		}

	}

}
