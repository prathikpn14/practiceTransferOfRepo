package demopackage2;

import org.testng.annotations.Test;

public class DemoOrg {

	@Test
	public void m2()
	{
		System.out.println("ORG created");
		String URL = System.getProperty("url" , "www.amazon.com");
		String BROWSER = System.getProperty("browser" , "firefox");
		String USERNAME = System.getProperty("username" , "yoyo");
		String PASSWORD = System.getProperty("password" , "paasword");
		
		System.out.println("org url" + URL);
		System.out.println("org browser" + BROWSER);
		System.out.println("org username" + USERNAME);
		System.out.println("org password" + PASSWORD);
	}
	@Test
	public void m3()
	{
		System.out.println("ORG created 2");
	}
}
