package TestNG;

import org.testng.annotations.Test;

public class DemoTest {
@Test(groups="Regression")
public void createTest()
{
	System.out.println("--create test----");
}
@Test(groups="smoke")
public void editTest()
{
	System.out.println("--edit test----");
}

}
