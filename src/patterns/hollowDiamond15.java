package patterns;

public class hollowDiamond15 {

	public static void main(String[] args) {
		// Hollow full pyramid
		int n = 5;
		for(int i=0;i<n;i++) {
			int odd = 0;
			for(int j=0;j<(2*n)-1;j++) {
				if(j<n-i-1)
					System.out.print(" ");
				else if(odd<(2*i)+1) {
					if(odd==0 || odd==2*i)
						System.out.print("*");
					else
						System.out.print(" ");
					odd++;
				}
				else
					System.out.print(" ");
			}
		}
		
		// Inverted hollow full pyramid
		for(int i=0;i<n;i++) {
			for(int j=0;j<(2*n)-1;j++) {
				if(j==i || j==(n*2)-2-i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
