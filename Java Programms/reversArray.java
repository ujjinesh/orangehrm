package ujjinesh;

public class reversArray {

	public static void main(String[] args) {

		int[]a= new int[]{1,3,2,4,5,6};
		System.out.println("before revesre an array :" );
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("  ");
		System.out.println("After revesre an array :" );

		for (int  i = a.length-1;i >= 0; i--) {
			System.out.print(a[i]+" ");
		}
	}

}
