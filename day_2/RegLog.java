
import java.util.Scanner;

public class RegLog {
	public static void main(String[] args)
	{
		int log = 0;
		String username = "none~!#$$@$";
		String passward = "none~!#$$@$";
		Scanner myScan = new Scanner(System.in);

		while(true)
		{
			System.out.println("Welcome, \n1-login\n2-register");
			int i = myScan.nextInt();
			if(i == 1)
			{
				if(log == 0)
				{
					System.out.println("No one registrated.");
				}
				else
				{
					System.out.println("Enter user : ");
					String userCheck = myScan.next();
					if(userCheck.equals(username))
					{
						System.out.println("Enter password: ");
						String passwordCheck = myScan.next();
						if(passwordCheck.equals(passward))
						{
							System.out.println("|||   WELCOME!   |||");
						}
						else
						{
							System.out.println("Password incorrect.");
						}
					}
					else
					{
						System.out.println("User ncorrect.");
					}
				}
			}
			else
			{
				log = 1;
				System.out.println("Register user : ");
				String userCheck = myScan.next();
				username = userCheck;
				System.out.println("Enter password: ");
				String passwardCheck = myScan.next();
				passward = passwardCheck;
				System.out.println("== Registration completed ==");
			}
		}

	}
}
