import java.io.*;
class TestFour 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		BufferedReader r = new BufferedReader(new FileReader("tyson.txt"));
		BufferedWriter p = new BufferedWriter(new FileWriter("sri.txt"));

		String line;
		while((line=r.readLine())!=null)
			{
			System.out.println(line);
			p.write(line);
			p.newLine();
		}
		r.close();
		p.close();
	}
}
