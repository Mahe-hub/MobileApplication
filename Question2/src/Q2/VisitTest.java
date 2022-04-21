package Q2;
//--------------------------------------------------------------------
//Assignment (1)
//Written by: (Maher Deeb 209-5376)
//For Application Development 2 (Mobile) - Winter 2022
//--------------------------------------------------------------------
import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
public class VisitTest {

	public Date convertDate() 
	{
		String testDate="2022/04/20";
		Date date=null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		    date=sdf.parse(testDate);
			}
		catch(Exception e)
		{
			System.out.println("The exception is "+e);
		}
		return date;
	}
	Customer cTest= new Customer("CustomerTest");
	Visit vTest = new Visit("CustomerTest", convertDate() );
	@Test
	public void test() {
	cTest.SetMember(false);
	String expctedOutput="--------------------\nname CustomerTest\nis member false\nmember type null\ndate of vist: Wed Apr 20 00:00:00 EDT 2022\nService Expense 0.0\nProduct Expenses = 0.0\nTotal = 0.0";
	String acctualOuptut=vTest.toString();
	assertEquals(expctedOutput,acctualOuptut);
		
	}

}
