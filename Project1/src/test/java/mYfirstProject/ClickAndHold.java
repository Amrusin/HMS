package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement circle = driver.findElement(By.id("circle"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.clickAndHold(circle).pause(2000).release().perform();
		/*Thread.sleep(2000);
		a.release(circle).perform();*/
		
		driver.quit();
		
	}

}
