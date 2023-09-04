package ujjinesh;

public class reverseanumber {

	public static void main(String[] args) {

		int num=6432;
		int rev=0;
		for(;num!=0;num=num/10){
			int reminder=num%10;
			rev=rev*10+reminder;
			
		}
		System.err.println(rev);
	}

}
