import java.util.Scanner;

public class ex_01{
	public static void main(String[] args)
	{
		System.out.println("enter 2 numbers ---");
		Scanner myScan = new Scanner(System.in);
		int i = myScan.nextInt();
		int k = myScan.nextInt();
		System.out.println("somma = "+ (i + k));
		System.out.println("divisione = "+ (i / k));
		System.out.println("moliplicazione = "+ (i * k));

		System.out.println("________________");
		// testing while & do while

		int j = 0;

		while(j < 3)
		{
			System.out.println("j = " + j);
			j++;
		}

	}
}
