package conditional_Statements;

public class Ifelse {

	public static void main(String[] args) {
		
		int q=9;
		int r=12;
		int y=5;
		
		
		if (q>y & q>r) {
			System.out.println("q is greater than y&r "+q);
			
		} else if(r>q & r>y) {

			System.out.println("r is greater than q&y =" +r);
			
		}else{
			
			System.out.println("y is greater than r&q"+y);
		}
	}
}
