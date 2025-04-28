import java.util.Scanner;

//Testing lbrary Scanner

class ProvaScanner {
	public static void main(String[] args)
	{
		//String
		Scanner myObj = new Scanner(System.in);
		System.out.println("-Enter your name: ");
		String name = myObj.nextLine();
		System.out.println("User name = " + name);

		//int
		Scanner myObj2 = new Scanner(System.in);
		System.out.println("-Enter your age :");
		int age = myObj2.nextInt();
		System.out.println(name + " age = " + age);
	}
}
