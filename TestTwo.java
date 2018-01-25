import java.io.*;
class TestTwo 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		FileReader m = new FileReader("xyz.txt");
		FileWriter n = new FileWriter("ram.txt");
		
		int a;
		while((a = m.read()) != -1)
		{
			System.out.println((char)a);
			n.write(a);
		}

		m.close();
		n.close();

		
	}
}
