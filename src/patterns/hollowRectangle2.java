package patterns;

public class hollowRectangle2 {

	public static void main(String[] args) {
		int row = 3, col = 5;
		for(int i=0;i<row;i++) {
			if(i==0 || i==row-1) {
				for(int j=0;j<col;j++) {							
					System.out.print("*"+" ");
				}
			}
			else {
				System.out.print("*"+" ");
				for(int j=1;j<col-1;j++) {
						System.out.print(" "+" ");
				}
				System.out.print("*"+" ");
			}			
			System.out.println();
		}

	}

}	