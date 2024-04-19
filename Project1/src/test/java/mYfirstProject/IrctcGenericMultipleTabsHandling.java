package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import GenericUtils.WebDriverUtils;

public class IrctcGenericMultipleTabsHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverUtils wLib=new WebDriverUtils();
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()=' BUSES ']")).click();
		Thread.sleep(2000);
		
		wLib.switchWindow(driver, "home");
		driver.findElement(By.id("departFrom")).sendKeys("Bangalore");
		Thread.sleep(2000);
		driver.findElement(By.id("goingTo")).sendKeys("Goa");
		Thread.sleep(2000);	
		driver.close();
		
		
		wLib.switchWindow(driver, "train-search");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
		Thread.sleep(2000);
		
		/*wLib.switchWindow(driver, "in");
		WebElement origin = driver.findElement(By.id("stationFrom"));
		origin.click();
		Select s =new Select(origin);
		s.selectByIndex(2);*/
		
		
		
	}

}
