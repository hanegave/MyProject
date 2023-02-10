package GroupExecution;

import org.testng.annotations.Test;

public class Test1 {
	@Test(groups = "Smoke")
	public void demo1() {
		System.out.println("Test1 - Smoke");
	}

	@Test(groups = "Sanaty")
	public void demo2() {
		System.out.println("Test1 - Sanaty");
	}

	@Test(groups = "Smoke")
	public void demo3() {
		System.out.println("Test1 - Smoke");
	}

}
