package bitManipulation;

public class binaryToDecimal {

	public static void main(String[] args) {
		int binary = 10111; //binary cannot be shifted
		int decimal = 0;
		int i=0;
		while(binary>0) {
			decimal += (binary%10)*Math.pow(2, i++);
			binary/=10;
		}
		System.out.println(decimal);

	}

}
