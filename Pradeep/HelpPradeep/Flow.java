import java.io.*;
class Flow 
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		FileReader m = new FileReader("SonOne.txt");
		FileReader n = new FileReader("E:\\Backend\\DurgaSoft\\DurgaRatan\\Core\\14io package\\Pradeep\\HelpPradeep\\DaughterOne\\GrandDaughter\\OneGrandDaughter.txt");
		FileReader o = new FileReader("E:\\Backend\\DurgaSoft\\DurgaRatan\\Core\\14io package\\Pradeep\\HelpPradeep\\DaughterOne\\GrandDaughter\\TwoGrandDaughter.txt");
		FileReader p = new FileReader("SonTwo.txt");
		FileReader q = new FileReader("E:\\Backend\\DurgaSoft\\DurgaRatan\\Core\\14io package\\Pradeep\\HelpPradeep\\DaughterOne\\GrandSon\\OneGrandSon.txt");
		FileReader r = new FileReader("E:\\Backend\\DurgaSoft\\DurgaRatan\\Core\\14io package\\Pradeep\\HelpPradeep\\DaughterOne\\GrandSon\\TwoGrandSon.txt");

		int a;
		while((a = m.read()) != -1)
		{
			System.out.println((char)a);
			
		}

		int b;
		while((b = n.read()) != -1)
		{
			System.out.println((char)b);
			
		}

		int c;
		while((c = o.read()) != -1)
		{
			System.out.println((char)c);
			
		}

		int d;
		while((d = p.read()) != -1)
		{
			System.out.println((char)d);
			
		}
		int e;
		while((e = q.read()) != -1)
		{
			System.out.println((char)e);
			
		}
		int f;
		while((f= r.read()) != -1)
		{
			System.out.println((char)f);
			
		}
		m.close();
		n.close();
		o.close();
		p.close();
		q.close();
		r.close();
	}
}