package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollByamountAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebElement element = driver.findElement(By.xpath("//a[contains(.,'Conditions of Use & Sale')]"));
/*Point location = element.getLocation();
int x = location.getX();
int y=location.getY();*/
Actions a =new Actions(driver);
//a.scrollByAmount(x, y).perform();

a.scrollToElement(element).pause(4000).perform();

Thread.sleep(2000);
driver.quit();

	}

}
