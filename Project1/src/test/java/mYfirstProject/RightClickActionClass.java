package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	WebElement rightClick = driver.findElement(By.id("btn30"));
	Actions a =new Actions(driver);
	a.contextClick(rightClick).perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[text()='Yes']")).click();
	Thread.sleep(2000);
	driver.quit();
	
	}
	

}
