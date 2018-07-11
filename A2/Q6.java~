import java.util.*;

interface Book
{
	void details(String name,String type);
}

class Author 
{
	private String aName;
	private String DOB;
	private String qualification;
	
	public void setaName(String name)
	{  aName=name;}

	public void setDob(String dob)
	{  DOB=dob;}
	
	public void setQual(String qual)
	{  qualification=qual;}

	public String getaName()
	{  return aName;}

	public String getDob()
	{  return DOB;}

	public String getQual()
	{  return qualification;}
}

public class BookDetails implements Book
{
	static String bName;
	static String bType;
	void details(String name,String type)
	{
		bName=name;
		bType=type;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		BookDetails bd=new BookDetails();
		Author a=new Author();

		System.out.print("Book Name:");
		String name=s.next();
		System.out.print("Book Type:");
		String type=s.next();
		bd.details(name,type);
		
		System.out.println(bName,bType);
	}
}




