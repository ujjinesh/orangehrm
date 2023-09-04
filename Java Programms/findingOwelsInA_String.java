package ujjinesh;

public class findingOwelsInA_String {

	public static void main(String[] args) {

		String str="uvmech";
		str=str.toLowerCase();
		int count=0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
	                || str.charAt(i) == 'i'
	                || str.charAt(i) == 'o'
	                || str.charAt(i) == 'u'){
				
				count++;
			}

			
		}
		System.out.println(count);

//				for (int j = 0; j < str.length(); j++) {
//			char ch = str.charAt(j);
//			
//			switch (ch) {
//			case 'a':
//			case 'e':
//			case 'i':
//			case 'o':
//			case 'u':
//				
//				 System.out.println(ch + " is a Vowel.");
//					break;
//
//			default:
//                System.out.println(ch + " is a Non-Vowel Character.");
//
//			}
//		}
		}
	}


