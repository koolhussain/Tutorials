import java.util.Scanner;

class InvalidCustomerException extends Exception
{
	public String getMessage()
	{
		return "Invalid Input. Try Again...!!!!";
	}
}

class ATM
{
	int acc_no = 2222;
	int pass_word = 9999;
	int an;
	int pwd;

	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Account No");
		an = scan.nextInt();
		System.out.println("Enter the Password");
		pwd = scan.nextInt();
	}

	public void verify() throws Exception
	{
		if(an == acc_no && pwd == pass_word)
		{
			System.out.println("Collect your Money");
		}
		else
		{
			InvalidCustomerException ice =  new InvalidCustomerException();
			System.out.println(ice.getMessage());
			throw ice;
		}
	}
}

class Bank
{
	public void initiate()
	{
		ATM atm = new ATM();
		try
		{
			atm.acceptInput();
			atm.verify();
		}
		catch (Exception e)
		{
			try
			{
				atm.acceptInput();
				atm.verify();
			}
			catch (Exception f)
			{
				try
				{
					atm.acceptInput();
					atm.verify();
				}
				catch (Exception g)
				{
					System.exit(0);
				}
			}
		}
	}
}
class Exception11 
{
	public static void main(String[] args) 
	{
		Bank bank = new Bank();
		bank.initiate();
	}
}
