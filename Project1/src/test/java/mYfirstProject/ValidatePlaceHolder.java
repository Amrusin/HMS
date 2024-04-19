package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatePlaceHolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.get("https://demoapps.qspiders.com/ui?scenario=4");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 WebElement text = driver.findElement(By.id("name"));
 String ph = text.getAttribute("placeholder");
 System.out.println(ph);
 if(ph.equalsIgnoreCase("Enter your name"))
 {
	 System.out.println("Place holder is present");
 }
 else
 {
	 System.out.println("Place holder is not present");
 }
// driver.quit();
 
	}

}
