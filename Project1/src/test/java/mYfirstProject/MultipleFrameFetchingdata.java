package mYfirstProject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleFrameFetchingdata {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("browserLink1")).click();
		Thread.sleep(2000);
		Set<String> window = driver.getWindowHandles();
		for(String ele:window)
		{
			driver.switchTo().window(ele);
			String data = driver.getCurrentUrl();
			if(data.contains("SignUp Page"))
			{
				break;
			}
			}
			driver.findElement(By.id("email")).sendKeys("abc");
			Thread.sleep(2000);
			driver.findElement(By.id("password")).sendKeys("xyz");
			Thread.sleep(2000);
			driver.findElement(By.id("confirm-password")).sendKeys("qwerty");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		}
	}

