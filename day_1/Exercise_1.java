import java.util.Scanner;

public class Exercise_1
{
		public static void main(String[] args)
	{
		Scanner myScan = new Scanner(System.in);
		System.out.println("~ Enter int value :");
		int i = myScan.nextInt();
		//
		System.out.println("\n____________");
		System.out.println("~ Enter char value :");
		char c = myScan.next().charAt(0);
		//
		System.out.println("\n____________");
		System.out.println("~ Enter string value :");
		String s = myScan.next();
		//
		System.out.println("\n____________");
		System.out.println("~ Enter float value :");
		float f = myScan.nextFloat();
		//
		System.out.println("\n____________");
		System.out.println("~ Enter double value :");
		double d = myScan.nextDouble();
		System.out.println("\n____________");

		System.out.println("\n int = " + i +
						"\n char = " + c +
						"\n String = " + s +
						"\n float = " + f +
						"\n double = " + d);
		//close myScan to avoid memory leaks
		myScan.close();
	}
}
