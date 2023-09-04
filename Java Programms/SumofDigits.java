package ujjinesh;

public class SumofDigits {

	public static void main(String[] args) {

		int n=3765;
		int sum=0;
		int u;
		while(n>0){
			u=n%10;
			sum=sum+u;
			n=n/10;
		}
		System.out.println(sum);
	}

}
