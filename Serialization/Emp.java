import java.io.*;
class Emp implements Serializable  
{
	//instance variables
	int eid;
	String ename;
	//declaring a construcotr to convert local variables to instance variables
	Emp(int i, String n){
		this.eid = i;
		this.ename = n;
	}
	
}
