package Q2;
//--------------------------------------------------------------------
//Assignment (1)
//Written by: (Maher Deeb 209-5376)
//For Application Development 2 (Mobile) - Winter 2022
//--------------------------------------------------------------------
import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTesting {

	Customer c = new Customer("test1");
	
	@Test
	public void test() 
	{
	  c.SetMember(false);
	  String exptecdLine="--------------------\nname test1\nis member false\nmember type null"; 
	  String line = c.toString();
	  assertEquals(exptecdLine,line);
	}

}
