package ujjinesh;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {

		String ori,rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num/string to check a palindrome");
		
	      ori = sc.nextLine();
	      int len=ori.length();
	      for (int i =len-1; i >= 0; i--) {
			rev=rev+ori.charAt(i);
		}
	      if (ori.equals(rev)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");

		}
	      
			//palindrome  number
//			int num=2432;
//			int ori_num=num;
//			int n;
//			int rev=0;
//			while (num>0) {
//				n=num%10;
//				rev=rev*10+n;
//				num=num/10;
//			}
//			if(ori_num==rev){
//				System.out.println("palindrome :"+ori_num);
//			}else{
//				System.out.println("not a palindrome :");
	//
//			}
			
			//palindrome String
			
			String str="radar";
			String or = str;
			String re="";
			
			for (int  i = str.length()-1; i >= 0; i--)
			{
				re=rev+str.charAt(i);
			}
			if (ori.equals(re)) {
				System.out.println("palindrome string :" +or);
			} else {
				System.out.println(" not apalindrome string :");

			}
			
	}

}
