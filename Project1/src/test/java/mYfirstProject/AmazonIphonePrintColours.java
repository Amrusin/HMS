package mYfirstProject;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIphonePrintColours {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone pro max");
driver.findElement(By.id("nav-search-submit-button")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//span[text()='Apple iPhone 15 Pro (128 GB) - Natural Titanium']")).click();
Set<String> win = driver.getWindowHandles();
for(String phone:win)
{
	driver.switchTo().window(phone);
}

 List<WebElement> ele = driver.findElements(By.xpath("//img[@class='imgSwatch']"));
for(WebElement colours:ele)
{
	String data = colours.getAttribute("alt");
	System.out.println(data);
}
driver.quit();
	}

}
