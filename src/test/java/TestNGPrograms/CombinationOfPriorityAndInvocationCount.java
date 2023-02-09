package TestNGPrograms;

import org.testng.annotations.Test;

public class CombinationOfPriorityAndInvocationCount {
	public class PriorityPrgm {
		@Test(invocationCount = 2,priority = 1)
		public void demo1() {  
		System.out.println("demo1");	
		}
		@Test(invocationCount = 0,priority=-2) 
		public void demo2() {
		System.out.println("demo2");	
		}
		@Test(enabled = false) //it will be not considered in the test Run count at all.
		public void demo3() {
		System.out.println("demo3");	
		}
		@Test
		public void demo4() {  
		System.out.println("demo4");	
		}
		@Test(invocationCount = -2,priority=1)
		public void demo5() { 
		System.out.println("demo5");	
		}
		}


}
