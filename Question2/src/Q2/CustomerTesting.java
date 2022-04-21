package Q2;

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
