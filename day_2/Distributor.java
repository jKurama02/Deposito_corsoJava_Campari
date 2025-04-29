import java.util.Scanner;

public class Distributor {
	public static void main(String[] args)
	{
	boolean stat = false;
	float credit = 10;
	System.out.println("Your credit is = " + credit
	+ "\n--Menu--\n1->Caffe - 1.5€\n2->Cappuccino - 2.0€\n3->Te - 1.00€\n4->Esc\n_______________");

	while(credit > 0 && stat == false)
	{
		Scanner dScan = new Scanner(System.in);
		int chose = dScan.nextInt();
		switch(chose)
		{
			case 1:
			{
				if((credit - 1.5) < 0)
					System.out.println("You don't have enough money");
				else
				{
					credit -= 1.5;
					System.out.println("You chose Caffe\nYour have " + credit + "lef");
				}
				break;
			}
			case 2:
			{
				if((credit - 2.0) < 0)
					System.out.println("You don't have enough money");
				else
				{
					credit -= 2.0;
					System.out.println("You chose Cappuccino\nYour have " + credit + " lef");
				}
				break;
			}
			case 3:
			{
				if((credit - 1.0) < 0)
					System.out.println("You don't have enough money");
				else
				{
					credit -= 1.0;
					System.out.println("You chose Te\nYour have " + credit + " lef");
				}
				break;
			}
			case 4:
			{
					System.out.println("You chose esc\nYour have " + credit + " lef");
					stat = true;
					break;
			}
		}
	}
}
}
