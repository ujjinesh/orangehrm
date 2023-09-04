package ujjinesh;

public class TwoArraysAreEqualorNot {

	public static void main(String[] args) {

		int[] u={1,2,3,4};
		int[] v={1,2,4,4};

//		boolean res = Arrays.equals(u, v);
//		
//		if (res==true) {
//			System.out.println("array are Equal");
//		} else {
//			System.out.println("array are Not Equal");
//
//		}
		
		//Approach-2
		boolean status=true;
		
		if(u.length==v.length)
		{
			for (int i = 0; i < u.length; i++) {
				if(u[i]!=v[i])
				{
					status=false;
				}
			}
		}else{
			status=false;
		}
		if(status==true){
			System.out.println("array are Equal");
		}else {
			System.out.println("array are not Equal");

		}
	}

}
