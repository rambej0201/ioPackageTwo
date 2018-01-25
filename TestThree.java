import java.io.*;
class TestThree 
{
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		BufferedReader b = new BufferedReader(new FileReader("tyson.txt"));
		BufferedWriter c = new BufferedWriter(new FileWriter("Ran.txt"));

		String line;

		while ((line = b.readLine())!=null)
		{
			System.out.println(line);
			c.write(line);
		}
		b.close();
		c.close();
		
	}
}
