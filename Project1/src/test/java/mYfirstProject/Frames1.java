package mYfirstProject;

import java.time.Duration;                //Multiple iFrame

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='w-full h-96']")));
Thread.sleep(2000);
driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
Thread.sleep(2000);
driver.findElement(By.id("password")).sendKeys("Admin@1234");
Thread.sleep(2000);
driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
Thread.sleep(2000);
driver.findElement(By.id("submitButton")).click();
Thread.sleep(2000);

driver.switchTo().defaultContent();

Thread.sleep(2000);
driver.switchTo().frame(driver.findElement(By.xpath("//section[@class='flex gap-10 w-full']//div[2]/iframe")));//(//iframe)[2]
Thread.sleep(2000);
driver.findElement(By.id("username")).sendKeys("SuperAdmin@gmail.com");
Thread.sleep(2000);
driver.findElement(By.id("password")).sendKeys("SuperAdmin@1234");
Thread.sleep(2000);
driver.findElement(By.id("submitButton")).click();
Thread.sleep(2000);


driver.quit();

	}

}
