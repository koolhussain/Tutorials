import java.util.Scanner;

class UnderAgeException extends Exception
{
	public String getMessage()
	{
		return "You are too Young. Try Later";
	}
}

class OverAgeException extends Exception
{
	public String getMessage()
	{
		return "You are too Old, Don't Try Again";
	}
}

class Applicant
{
	int age;

	public void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Age");
		age = scan.nextInt();
	}
	
	public void verify() throws Exception
	{
		if(age < 18)
		{
			UnderAgeException nae = new UnderAgeException();
			System.out.println(nae.getMessage());
			throw nae;
		}
		else if(age > 65)
		{
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
		else
		{
			System.out.println("Collect your DL");
		}
	}
}

class RTO
{
	public void initiate()
	{
		Applicant a = new Applicant();
		try
		{
			a.acceptInput();
			a.verify();
		}
		catch (Exception e)
		{
			try
			{
				a.acceptInput();
				a.verify();
			}
			catch (Exception f)
			{
				System.exit(0);
			}
		}
	}
}

class Exception12 
{
	public static void main(String[] args) 
	{
		RTO rto = new RTO();
		rto.initiate();
	}
}
