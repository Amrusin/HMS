package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedMultipleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demoapps.qspiders.com/ui/frames/nestedWithMultiple?sublist=3");
		WebElement mainframe = driver.findElement(By.xpath("//iframe[@class='w-full h-96']"));
		driver.switchTo().frame(mainframe);
		WebElement child = driver.findElement(By.xpath("//div[@class='form_container']//iframe"));
		driver.switchTo().frame(child);
		//System.out.println(driver.findElement(By.xpath("//h2[text()='Login']")));
		driver.switchTo().frame(0);
		driver.findElement(By.name("email")).sendKeys("Admin@gmail.com");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.id("password")).sendKeys("Admin@1234");
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		driver.findElement(By.id("confirm")).sendKeys("Admin@1234");
		driver.quit();
		
		
		
	}

}

