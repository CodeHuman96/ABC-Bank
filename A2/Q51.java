import java.util.*;
import java.io.*;

class Q51
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter file in .txt format");
		String filename=s.next();
		System.out.println("Enter String to add");
		s.nextLine();
		String str=s.nextLine();	
		try(BufferedWriter bw=new BufferedWriter(new FileWriter(filename,true)))
		{	
		bw.write(str);
		bw.close();
		}
		catch(Exception e){
		e.printStackTrace();
		}
	}
}
