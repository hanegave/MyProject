package VtigerCRMhardCoding;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCountToRepeateTheRun {
	@Test
	public void test0() { 
		System.out.println("hi there");
	}
	@Test(invocationCount = 4) //it will run for 4 times
	public void test3() {  
		System.out.println("where r u");
	}
	
	@Test(invocationCount = 3)  //it will run for 3 times
	public void test2() {
		System.out.println("am here");
	}
	
	@Test(invocationCount = 3) //it will run for 3 times
	public void test1() {
		System.out.println("ok");
	}		

}
