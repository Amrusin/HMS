package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleModalPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/modal/multiModal?sublist=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("multiModalButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("multiClosemodal")).click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//p[text()='This is the secondary modal']"));
		System.out.println(ele.getText());
		driver.findElement(By.xpath("//p[text()='This is the secondary modal']/../following-sibling::section/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("multiclose2")).click();
		
		
	}

}
