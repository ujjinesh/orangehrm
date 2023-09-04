package ujjinesh;

public class duplicatenumbers {

	public static void main(String[] args) {

		int [] a=new int[]{5, 2, 4, 5, 3,  6, 7, 4, 3,2};
		for(int i = 0; i < a.length; i++) {  
	    for(int j = i + 1; j < a.length; j++) {  
	        if(a[i] == a[j])  
	            System.out.println(a[j]);  
	    }  
	}  
		}
	}



