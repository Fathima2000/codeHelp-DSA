package matrix;
import java.util.*;

public class dynamic2DArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<int[]> rowList = new ArrayList<int[]>();
	
		int row = sc.nextInt();
		
		for(int i=0;i<row;i++) {
			int col = sc.nextInt();
			int arr[] = new int[col];
			for(int j=0;j<col;j++) {
				arr[j] = sc.nextInt();
			}
			rowList.add(arr);
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<rowList.get(i).length;j++) {
				System.out.print(rowList.get(i)[j]+" ");
			}
			System.out.println();
		}

	}
}

//Input
//3
//3
//1 2 3
//2
//1 2
//1
//1
