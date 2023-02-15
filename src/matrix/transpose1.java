package matrix;

public class transpose1 {

	public static void main(String[] args) {
		int row = 3, col = 3;
		int arr[][] = {{1,2,3},
					   {4,5,6},
					   {7,8,9}};
				 
		for(int i=0;i<row;i++) {
			for(int j=0;j<i;j++) {
				int tmp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = tmp;
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}

	}

}
