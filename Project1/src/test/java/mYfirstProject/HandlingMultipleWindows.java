package mYfirstProject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GenericUtils.WebDriverUtils;

public class HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui/browser/multipleTabs?sublist=3");
		
		WebDriverUtils wLib=new WebDriverUtils();
		driver.findElement(By.id("browserButton2")).click();
		
		wLib.switchWindow(driver, "SignUpPage");
		
		driver.findElement(By.id("email")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("xyz");
		Thread.sleep(2000);
		driver.findElement(By.id("confirm-password")).sendKeys("xyz");
		
		wLib.switchWindow(driver, "SignUp");
		
		driver.findElement(By.id("username")).sendKeys("abc");
		Thread.sleep(2000);
		
		wLib.switchWindow(driver, "Login");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("qwerty");
		}
	}


