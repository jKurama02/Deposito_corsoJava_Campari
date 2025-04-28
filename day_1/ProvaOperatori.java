public class ProvaOperatori
{
	public static void main(String[] args)
	{
		int i = 5;
		i += 6;
		System.out.println("i += 6 = "+i);

		i--;
		System.out.println("i-- = " + i);
		//same for i++
		i %= 2;
		System.out.println("i %= 2 = " + i);

		//comparison operator

		System.out.println("i22 > 4 = " + (i > 4));

		i += 20;
		System.out.println("i is now " + i);

		//logilac operator
		System.out.println("i is greater than 5 and minor than 60? " + ((i > 5) && (i < 60)));
	}
}

