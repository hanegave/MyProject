package GroupExecution;

import org.testng.annotations.Test;

public class FirstTest {
	@Test(groups = "Smoke")
	public void test0() {
		System.out.println("test0");
	}

	@Test(groups = "Sanaty")
	public void test1() {
		System.out.println("test1");
	}

	@Test(groups = { "Smoke", "Regression" })
	public void test2() {
		System.out.println("test2");
	}
}
