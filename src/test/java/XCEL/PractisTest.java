package XCEL;

import org.testng.annotations.Test;
import org.testng.xml.XmlTest;

public class PractisTest {

	@Test
	public void demoTest(XmlTest xml)
	{
		System.out.println("in demo Test");
		System.out.println(xml.getParameter("url"));
		System.out.println(xml.getParameter("username"));
		System.out.println(xml.getParameter("passward"));
	}

}
