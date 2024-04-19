package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureTheDatafromTextfeild {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://demoapps.qspiders.com/ui?scenario=5");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebElement ele= driver.findElement(By.xpath("//input[@id='name']"));
ele.sendKeys("Sindhu");
Thread.sleep(3000);
String data = ele.getAttribute("value");
Thread.sleep(2000);
System.out.println(data);
Thread.sleep(2000);


	}

}
