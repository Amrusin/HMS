package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopUpKsrtc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ksrtc.in/");
		String Month="April";
		String Year="2024";
		int date=2;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		WebElement from = driver.findElement(By.id("fromPlaceName"));
		from.click();
		Actions a =new Actions(driver);
		a.click(from).sendKeys("Bengaluru").perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='BENGALURU']")).click();
		
		WebElement to = driver.findElement(By.id("toPlaceName"));
		to.click();
		a.click(to).sendKeys("goa").perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='GOA']")).click();
		
		driver.findElement(By.id("txtJourneyDate")).click();
		for(;;)
		{
			try {
				
			
		
		driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[text()='"+Month+"']/following-sibling::span[text()='"+Year+"']/../../..//table//a[text()='"+date+"']")).click();
		break;
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//a[@title='Next']//span")).click();
			
		//driver.findElement(By.id("txtReturnJourneyDate")).click();
		//driver.findElement(By.xpath("//div[@class='ui-datepicker-title']//span[text()='April']/following-sibling::span[text()='2024']/../../..//table//a[text()='6']")).click();
		}
		
	}}}
