import java.io.*;
class TestFive 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		BufferedInputStream p = new BufferedInputStream(new FileInputStream("Ran.txt"));
		BufferedOutputStream q = new BufferedOutputStream(new FileOutputStream("mahi.txt"));

		int line;
		while ((line = p.read())!= -1)
		{
			System.out.println((char)line);
			q.write(line);
		}
		p.close();
		q.close();
	}
}
