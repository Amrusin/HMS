package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioOfAmazonFacebookFlipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.amazon.in/");
Thread.sleep(2000);
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.facebook.com/");
Thread.sleep(2000);
driver.switchTo().newWindow(WindowType.WINDOW);
driver.get("https://www.flipkart.com/");
Thread.sleep(2000);

WebDriver driver1= new ChromeDriver();
driver1.manage().window().maximize();
driver1.get("https://www.amazon.in/");
driver1.switchTo().newWindow(WindowType.TAB);
driver.get("https://www.facebook.com/");
driver1.switchTo().newWindow(WindowType.TAB);
driver.get("https://www.flipkart.com/");

WebDriver driver2 =new ChromeDriver();
for(int i=0;i<4;i++)
{
	driver2.switchTo().newWindow(WindowType.WINDOW);
	
}

WebDriver driver3=new ChromeDriver();
for(int i=1;i<5;i++)
{
	driver3.switchTo().newWindow(WindowType.TAB);
}
	}

}
