package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedMultipleFrameFetchData {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		WebElement mainframe = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(mainframe);
		WebElement email = driver.findElement(By.xpath("//p[.='Admin@gmail.com']"));
		//System.out.println(driver.findElement(By.xpath("//h2[text()='Login']")));
		String e = email.getText();
		System.out.println(e);
		WebElement child = driver.findElement(By.xpath("//div[@class='form_container']//iframe"));
	    driver.switchTo().frame(child);
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(e);
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(mainframe);
		WebElement pwd = driver.findElement(By.xpath("(//p[text()='Admin@1234'])[1]"));
		String p = pwd.getText();
		System.out.println(p);
		
		driver.switchTo().frame(child);
		
		driver.switchTo().frame(1);
		driver.findElement(By.id("password")).sendKeys(p);
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(mainframe);
		WebElement confirm = driver.findElement(By.xpath("(//p[text()='Admin@1234'])[2]"));
		String c = confirm.getText();
		System.out.println(c);
		
		driver.switchTo().frame(child);
		
		driver.switchTo().frame(2);
		driver.findElement(By.id("confirm")).sendKeys(c);
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame(3);
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
