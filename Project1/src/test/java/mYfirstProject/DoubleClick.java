package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebElement DoubleClick = driver.findElement(By.id("btn20"));
			Actions a =new Actions(driver);
			a.doubleClick(DoubleClick).perform();
			Thread.sleep(2000);
			driver.quit();
	}

}
