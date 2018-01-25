import java.io.*;
class DeserializationTest 
{
	public static void main(String[] args) throws Exception
	{
		FileInputStream u = new FileInputStream("fifty.txt");
		ObjectInputStream v = new ObjectInputStream(u);
		Emp e = (Emp)v.readObject();

		System.out.println(e.eid+"-----"+e.ename);
	}
}
