package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyRightClick {

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
			WebElement text = driver.findElement(By.xpath("//span[contains(.,'You selected \"Yes\"')]"));
			String Actualtext = text.getText();
			System.out.println(Actualtext);
			if(Actualtext.contains("Yes"))
					{
				System.out.println("You selected yes");
					}
			else
			{
				System.out.println("you selected no");
			}
			Thread.sleep(2000);
			
			driver.quit();
	}

}
