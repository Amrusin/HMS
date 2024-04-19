package AssertionsPractise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	@Test
	public void hardAssert()
	{
		String expTitle="Google";
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expTitle);
		System.out.println(actualTitle);
	}
	@Test
	public void DemoTest()
	{
		int a=5;
		Assert.assertNotNull(a);
		System.out.println(a);
	}
}
