import java.io.*;
class DeserializationOne 
{
	public static void main(String[] args) throws Exception
	{
		ObjectInputStream r = new ObjectInputStream(new FileInputStream ("sixty.txt"));
		Emp e = (Emp)r.readObject();
		System.out.println(e.eid+"-------"+e.ename);
	}
}
