
package mYfirstProject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IrctcHandlingMultipleWindowWithoutIterator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
		Thread.sleep(2000);
		Set<String> win = driver.getWindowHandles();
		for(String ele:win)
		{
			driver.switchTo().window(ele);
			String title = driver.getCurrentUrl();
			if(title.contains("Online Bus Ticket"))
			{
				break;
			}
		}
		driver.findElement(By.id("departFrom")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.id("goingTo")).sendKeys("Goa");
		Thread.sleep(2000);		
		driver.quit();
			
	}

}
