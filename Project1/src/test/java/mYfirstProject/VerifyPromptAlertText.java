package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPromptAlertText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("buttonAlert1")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		a.sendKeys("yes");
		a.accept();
		WebElement ele = driver.findElement(By.xpath("//p[@class='pt-2 text-center']"));
		String text = ele.getText();
		if(text.contains("yes"))
		{
			System.out.println("you selected yes");
		}
		else
		{
			System.out.println("you selected no");
		}
		driver.quit();
	}

}
