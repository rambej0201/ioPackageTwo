import java.io.*;
class SerializationTest 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		Emp e = new Emp(45, "Rao");
		FileOutputStream a = new FileOutputStream("fifty.txt");
		ObjectOutputStream b = new ObjectOutputStream(a);
		b.writeObject(e);
		System.out.println("Serialization processed successfully");
	}
}
