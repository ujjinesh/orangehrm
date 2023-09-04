package ujjinesh;

import java.util.Random;

public class Genarate_RandomNumAndString {

	public static void main(String[] args) {

		Random ran = new Random();
		int ra = ran.nextInt(1000);
		System.out.println(ra);

		double dou = ran.nextDouble();
		System.out.println(dou);
		System.out.println(Math.random());
		
		//Random String
		
		
//		String num=	RandomStringUtils.randomNumeric(10);
//		System.out.println(num);

		
//	String str=	RandomStringUtils.RandomAlphabetic(10);
//	System.out.println(str);

	}

}
