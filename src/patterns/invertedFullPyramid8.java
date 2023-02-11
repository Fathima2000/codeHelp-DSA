package patterns;

public class invertedFullPyramid8 {

	public static void main(String[] args) {
		int n = 10;
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
