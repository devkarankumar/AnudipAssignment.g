package myproject1;

public class Array2 {

	public static void main(String[] args) {
		int[] ar= {5,6,7};
		System.out.println(sumOfArray(ar));
	}
	public static int sumOfArray(int[] ar) {
		int sum=0;
		for (int i=0; i<ar.length;i++) {
			sum+=ar[i];
		}
		return sum;

	}

}
