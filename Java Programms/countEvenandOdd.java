package ujjinesh;

public class countEvenandOdd {
	
public static void main(String[] args) {
	
	int [] a={1,3,2,4,5,6};
	
	int even_count=0,odd_count=0;
	System.out.println("Even numbers :");

	for (int i = 0; i < a.length; i++) {
		if (a[i]%2==0) {
			System.out.println("even numbers in an Array :"+a[i]);
			even_count++;
		}
	}
	System.out.println("Odd numbers :");
	for (int i = 0; i < a.length; i++) {
		if (a[i]%2!=0) {
			System.out.println("even numbers in an Array :"+a[i]);
			odd_count++;
		}
	}
}
	

}
