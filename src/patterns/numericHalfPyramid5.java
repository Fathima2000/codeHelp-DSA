package patterns;

public class numericHalfPyramid5 {

	public static void main(String[] args) {
		int n = 6;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print((j+1)+" ");
			}
			System.out.println();	
		}

	}

}
