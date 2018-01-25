import java.io.*;
class SerializationOne 
{
	public static void main(String[] args) throws Exception
	{
		Emp e = new Emp(45879646, "Papa");
		new ObjectOutputStream(new FileOutputStream("sixty.txt")).writeObject(e);
		System.out.println("Serilaization processed at project level");
	}
}
