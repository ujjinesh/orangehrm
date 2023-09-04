package ujjinesh;

public class largest3numbers {

	public static void main(String[] args) {

		int a, b, c;
		a = 100;
		b = 30;
		c = 40;
//		
//       if(a>b&&a>c){
//    	   System.out.println("a is the largesr number :"+a);
//       }else if(b>a&&b>c){
//    	   System.out.println("b is the largesr number :"+b);
//       }else {
//    	   System.out.println("c is the largesr number :"+c);
//       }
       
       //ternory operator
//       int largest1=a>b?a:b;
//      System.out.println(largest1);
//       
//      int lar=c>largest1?c:largest1;
//      System.out.println(lar);
//      
      int La=c>(a>b?a:b)?c:(a>b?a:b);
      System.out.println(La);

	}

}
