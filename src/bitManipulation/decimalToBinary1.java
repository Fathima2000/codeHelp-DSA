package bitManipulation;

public class decimalToBinary1 {

	public static void main(String[] args) {
		int n = 13;
		int binaryNumber = 0;
		int i = 0;
		while(n>0) {
			// n&1 === n%2 
			// n>>1 === n/2
			binaryNumber += (n&1)*Math.pow(10, i++);
			n=n>>1;
		}
		System.out.println(binaryNumber);

	}

}
