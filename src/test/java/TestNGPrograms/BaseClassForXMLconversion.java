package TestNGPrograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClassForXMLconversion {
	@BeforeSuite
	public void suiteConfigration() {
		System.out.println("@BeforeSuite");
	}
	
	@BeforeTest
	public void TestConfigration() {
		System.out.println("@BeforeTest");
	}
	@BeforeClass
	public void ClassConfigration() {
		System.out.println("@BeforeClass");
	}
	@BeforeMethod
	public void MethodConfigration() {
		System.out.println("@BeforeMethos");
	}
	@AfterMethod
	public void MethodConTearDown() {
		System.out.println("@AfterMethos");
	}
	@AfterClass
	public void ClassTearDown() {
		System.out.println("@AfterClass");
	}
	@AfterTest
	public void TestTearDown() {
		System.out.println("@AfterTest");
	}
	@AfterSuite
	public void suiteTearDown() {
		System.out.println("@AfterSuite");
	}

}
