package patterns;

public class fancyPattern26 {

	public static void main(String[] args) {
		int n = 4;
		int count = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
		}
		
		int start = count - n; 
		for(int i=0;i<n;i++) {
			int k = start;
			for(int j=0;j<=n-i-1;j++) {
				System.out.print(k);
				k++;
			}
			start = start - (n-i-1);
			System.out.println();
		}

	}

}
