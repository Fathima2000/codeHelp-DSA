package patterns;

public class numericFullPyramid19 {

	public static void main(String[] args) {
		int n = 5;
		
		for(int i=0;i<n;i++) {
			// spaces
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			
			//numbers
			for(int j=0;j<i+1;j++) {
				System.out.print(j+i+1);
			}
			
			//reverse numbers
			int start = 2*i;
			for(int j=0;j<i;j++) {
				System.out.print(start);
				start=start-1;
			}
			
			System.out.println();
		}
	}

}