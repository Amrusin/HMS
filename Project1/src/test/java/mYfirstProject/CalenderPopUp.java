 package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		String MonthAndYear="March 2025";
		int date=27;
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		Thread.sleep(2000);
	    WebElement from = driver.findElement(By.xpath("//span[text()='From']/..//p"));
	    from.click();
	    Actions a = new Actions(driver);
	    a.click(from).sendKeys("Bengaluru").perform();
	    
	    driver.findElement(By.xpath("//span[text()=\"Bengaluru, India\"]")).click();
	    Thread.sleep(2000);
	    WebElement To = driver.findElement(By.xpath("//input[@type='text']"));
	    To.click();
	    a.click(To).sendKeys("Goa").perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//span[text()=\"Goa - Dabolim Airport, India\"]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//span[text()='Departure']")).click();
	    for(;;)
	    {
	    	try
	    	{
	    		
	    driver.findElement(By.xpath("//div[text()='"+MonthAndYear+"']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='"+date+"']")).click();
	    break;
	    	}
	    	catch(Exception e)
	    	{
	    		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	    	}
	    }
	    }
	}

