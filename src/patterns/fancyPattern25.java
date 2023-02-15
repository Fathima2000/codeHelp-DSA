package patterns;

import java.util.Scanner;

public class fancyPattern25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>9) {
			System.out.println("Enter value less than 9");
			return;
		}
		
		for(int i=0;i<n;i++) {
			int start_num_index = 8-i;
			int num = i+1;
			int count = num;
			for(int j=0;j<17;j++) {				
				if(count>0 && j==start_num_index) {
					System.out.print(num);
					count--;
					start_num_index+=2;
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
				
		}
			
	}

}
