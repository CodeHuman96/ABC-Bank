import java.util.*;

class UserDefined extends Exception
{
	String msg;
	public UserDefined(String msg)
	{
		this.msg=msg;
	}

	static void operation(int n) 
	{
		try
		{
			if(n<18)
			{
				UserDefined ud=new UserDefined("must be greater than 18");
				throw ud;
			}
			System.out.println(n+" valid age");
		}
		catch(UserDefined ud)
		{
			System.out.println(ud.msg);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age:");
		int n=s.nextInt();
		UserDefined.operation(n);
	}
}
