package ujjinesh;

public class PrintEvenAndOddNum {

	public static void main(String[] args) {

		int[] a = { 2, 3, 5, 4, 6, 8, 9 };

		System.out.println("even numbers.........");

//		for (int i = 0; i < a.length; i++) {
//
//			if (a[i] % 2 == 0) {
//				System.out.println(a[i]);
//			}
//		}
		for(int val : a)
		{
			if (val%2==0) {
				System.out.println(val);
			}
		}
		System.out.println("odd numbers.........");
		
		for(int val : a)
		{
			if (val%2!=0) {
				System.out.println(val);
			}
		}

//		for (int i = 0; i < a.length; i++) {
//
//			if (a[i] % 2 != 0) {
//				System.out.println(a[i]);
//			}
//		}
	}

}
