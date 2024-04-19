package mYfirstProject;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.salesforce.com/au/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("(//a[@class='cta_button'])[2]")).click();
	driver.findElement(By.xpath("(//a[@class='cta_button'])[3]")).click();
	driver.findElement(By.xpath("(//a[@class='cta_button'])[4]")).click();
	driver.findElement(By.xpath("(//a[@class='cta_button'])[5]")).click();
	Set<String> windowHandles = driver.getWindowHandles();

	Iterator<String> iterator=windowHandles.iterator();
	String ParentWindow=iterator.next();
	String childWindow1 = iterator.next();
	String childWindow2 = iterator.next();
	String childWindow3=iterator.next();

	System.out.println(ParentWindow);
	System.out.println(childWindow1);
	System.out.println(childWindow2);
	System.out.println(childWindow3);


	Thread.sleep(3000);
	driver.switchTo().window(childWindow2).close();
	driver.switchTo().window(ParentWindow);
	driver.quit();
	}
	}

