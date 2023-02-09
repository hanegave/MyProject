package VtigerCRMhardCoding;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityPractice {
	
	@Test
	public void test0() {  //3st execute
		Reporter.log("test0",true);
	}
	@Test(priority = -1) //2st execute
	public void test3() {  
		Reporter.log("test3",true);
	}
	
	@Test(priority = 1)  //4st execute
	public void test2() {
		Reporter.log("test2",true);
	}
	
	@Test(priority = -2) //1st execute
	public void test1() {
		Reporter.log("test1",true);
	}		

}
