package ujjinesh;

public class reversestring {

	public static void main(String[] args) {

		String uv="ujjinesh";
		//String rev="";
		for (int i = uv.length()-1;i >= 0; i--) {
			System.out.println(uv.charAt(i));
			//rev=uv.charAt(i)+rev;
		}
		//System.out.println(rev);
	}

}
