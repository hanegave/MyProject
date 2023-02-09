package VtigerCRMhardCoding;

import org.testng.annotations.Test;

public class EnableAndDesableTests {
	@Test(enabled = false, invocationCount  = 3,priority = 'A') 
	public void test0() { 
		System.out.println("hi there");
	}
	@Test(invocationCount = 2,priority = 'a')
	public void test3() { 
		System.out.println("maccha");
	}

}
