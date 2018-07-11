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
	{ 
        	aName=name;
	}

	public void setDob(String dob)
	{  
		DOB=dob;
	}
	
	public void setQual(String qual)
	{ 
		qualification=qual;
	}

	public String getaName()
	{  
		return aName;
	}

	public String getDob()
	{  
		return DOB;
	}

	public String getQual()
	{  
		return qualification;
	}
}

public class BookDetails implements Book
{
	static String bName;
	static String bType;
	public void details(String name,String type)
	{
		bName=name;
		bType=type;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		BookDetails bd=new BookDetails();
		Author a=new Author();

		System.out.println("Book Name:");
		String name=s.next();
		System.out.println("Book Type:");
		String type=s.next();
		bd.details(name,type);
		
		System.out.println("Author name:");
		String aname=s.next();
		a.setaName(aname);

		System.out.println("Author dob:");
		String adob=s.next();
		a.setDob(adob);
	
		System.out.println("Author qualification:");
		String qual=s.next();
		a.setQual(qual);

		System.out.println("-------Details are--------");
		System.out.println("Book Name:"+bName);
		System.out.println("Book Type:"+bType);
		System.out.println("Author Name:"+a.getaName());
		System.out.println("Author Dob:"+a.getDob());
		System.out.println("Author Qual"+a.getQual());

		System.out.println();
	}
}




