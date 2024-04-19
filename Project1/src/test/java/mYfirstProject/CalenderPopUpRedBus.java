package mYfirstProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class CalenderPopUpRedBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.redbus.in/");

		String Month = "Apr";
		String Year = "2024";
		int date = 28;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		driver.manage().window().maximize();
		driver.findElement(By.id("src")).sendKeys("Bengaluru");
		driver.findElement(By.id("dest")).sendKeys("Goa");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Date']")).click();

		for (;;) {
			try {
				driver.findElement(By.xpath("(//div[text()='" + Month + "']/../..//div[text()='" + Year
						+ "']/ancestor::div[@class='DatePicker__MainBlock-sc-1kf43k8-1 hHKFiR']/descendant::div[@class='DayTiles__CalendarDaysBlock-sc-1xum02u-0 isgDNj']//span[text()='"
						+ date + "'])[1]")).click();
				Thread.sleep(2000);
				break;
			} catch (Exception e) {
				
				Thread.sleep(2000);
				WebElement dates = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[3]"));
				Actions a = new Actions(driver);
				a.moveToElement(dates).click().pause(1000).perform();
			}
		}
		}

}