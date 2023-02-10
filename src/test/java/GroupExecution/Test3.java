package GroupExecution;

import org.testng.annotations.Test;

public class Test3 {
	@Test(groups = "System")
	public void demo1() {
		System.out.println("Test2 - System");
	}

	@Test(groups = "System")
	public void demo2() {
		System.out.println("Test2 - System");
	}

	@Test(groups = "Sanaty")
	public void demo3() {
		System.out.println("Test2 - Sanaty");
	}
}
