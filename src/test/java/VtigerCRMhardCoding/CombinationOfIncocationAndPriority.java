package VtigerCRMhardCoding;

import org.testng.annotations.Test;

public class CombinationOfIncocationAndPriority {
	
	@Test(invocationCount = 3,priority = 'A') //ASCII values is also comparable for execution
	public void test0() { 
		System.out.println("hi there");
	}
	@Test(invocationCount = 2,priority = 'a')
	public void test3() { 
		System.out.println("maccha");
	}

}
