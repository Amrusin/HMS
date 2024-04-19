package Practise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AvedaListMakeUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.aveda.de/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//button[text()='Ablehnen']")).click();
		WebElement makeup = driver.findElement(By.xpath("//a[@class='site-header__menu-logo js-site-header__menu-logo header-mobile-hidden']/ancestor::div[@class='clearfix site-header__menu-list-content js-site-header__menu-list-content']/descendant::li/a[text()='GESICHT & KÖRPER']"));
		Actions a=new Actions(driver);
		a.moveToElement(makeup).perform();
		
		
	}

}
