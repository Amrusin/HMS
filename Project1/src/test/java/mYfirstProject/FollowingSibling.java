package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FollowingSibling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://demoapps.qspiders.com/ui?scenario=1");
Thread.sleep(2000);
driver.findElement(By.xpath("//label[text()='Name']/following-sibling::input[@name='name']")).sendKeys("hi");
Thread.sleep(2000);
driver.findElement(By.xpath("//label[text()='Email Id']/following-sibling::input[@id='email']")).sendKeys("abc");
Thread.sleep(2000);
driver.findElement(By.xpath("//section[@class='relative']/input")).sendKeys("abc");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()='Register']")).click();

driver.quit();
	}

}
