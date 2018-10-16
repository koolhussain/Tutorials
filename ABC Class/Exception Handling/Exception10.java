import java.util.Scanner;

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
		int pwd = scan.nextInt();
	}

	public void verify()
	{
		if(an == acc_no && pwd == pass_word)
		{
			System.out.println("Collect Your Money");
		}
		else
		{
			System.out.println("Invalid Input. Try Again...!!!!");
		}
	}
}

class Bank
{
	public void initiate()
	{
		ATM atm = new ATM();
		atm.acceptInput();
		atm.verify();
	}
}

class Exception10 
{
	public static void main(String[] args) 
	{
		Bank bank = new Bank();
		bank.initiate();
	}
}
