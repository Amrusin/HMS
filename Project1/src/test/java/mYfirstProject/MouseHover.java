package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/mouseHover/tab?sublist=3");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement men = driver.findElement(By.xpath("//li[@class='Men p-4 relative']"));
		WebElement women = driver.findElement(By.xpath("//li[@class='Women p-4 relative']"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(men).perform();
		Thread.sleep(2000);
		a.moveToElement(women).perform();
	
		Thread.sleep(2000);
		
		driver.close();

	}

}
