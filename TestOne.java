import java.io.*;
class TestOne 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		FileInputStream s = new FileInputStream("abc.txt");
		FileOutputStream p = new FileOutputStream("xyz.txt");
		int c;

		while((c=s.read())!=-1)
		{
			System.out.println(c);
			p.write(c);
		}
		s.close();
		p.close();
	}
}
