package demopackage1;

import org.testng.annotations.Test;

public class DemoContact {

	@Test
	public void m1()
	{
		String URL = System.getProperty("url" , "www.amazon.com");
		String BROWSER = System.getProperty("browser" , "firefox");
		String USERNAME = System.getProperty("username" , "yoyo");
		String PASSWORD = System.getProperty("password" , "paasword");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
	}
}
