package TestNGPrograms;

import org.testng.annotations.Test;

public class InvocationCountForMultipleTimeRun {
	public class PriorityPrgm {
		@Test(invocationCount = 2)
		public void demo1() {   
		System.out.println("demo1");	
		}
		@Test
		public void demo2() {
		System.out.println("demo2");	
		}
		@Test(invocationCount = 0)
		public void demo3() {
		System.out.println("demo3");	
		}
		@Test(invocationCount = -5)
		public void demo4() {  
		System.out.println("demo4");	
		}
		@Test(invocationCount = 2)
		public void demo5() {  
		System.out.println("demo5");	
		}
		}


}
