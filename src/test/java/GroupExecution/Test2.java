package GroupExecution;

import org.testng.annotations.Test;

public class Test2 {
	@Test(groups = "Sanaty")
	public void demo1() {
		System.out.println("Test2 - Sanaty");
	}

	@Test(groups = "System")
	public void demo2() {
		System.out.println("Test2 - Syatem");
	}

	@Test(groups = "Sanaty")
	public void demo3() {
		System.out.println("Test2 - Sanaty");
	}
	
}
	

