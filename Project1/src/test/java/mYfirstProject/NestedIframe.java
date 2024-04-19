package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		WebElement mainframe = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(mainframe);
		
		WebElement email = driver.findElement(By.xpath("//p[.='Admin@gmail.com']"));
		String a = email.getText();
		System.out.println(a);
		
		WebElement childframe = driver.findElement(By.xpath("//section[@class='main_form_container']//iframe"));
		
		driver.switchTo().frame(childframe);
		driver.findElement(By.id("email")).sendKeys(a);
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		WebElement pwd = driver.findElement(By.xpath("(//p[text()='Admin@1234'])[1]"));
		String p = pwd.getText();
		System.out.println(p);
		
		driver.switchTo().frame(childframe);
		
		driver.findElement(By.id("password")).sendKeys(p);
		Thread.sleep(2000);
		
		driver.switchTo().parentFrame();
		
		WebElement confirmpwd = driver.findElement(By.xpath("(//p[.='Admin@1234'])[2]"));
		String Default=confirmpwd.getText();
		System.out.println(Default);
		
		driver.switchTo().frame(childframe);
		
		driver.findElement(By.id("confirm-password")).sendKeys(Default);
		Thread.sleep(2000);
		
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
