package Practise;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class YouTubeScenarioTest {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		ChromeOptions option= new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement search = driver.findElement(By.name("search_query"));
		search.sendKeys("song new");
		Thread.sleep(2000);
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Actions a =new Actions(driver);
		Thread.sleep(1000);
		a.moveToElement(search).click().perform();
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='sbsb_c gsfs']//div[@class='sbqs_c']"));
		int count=suggestions.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String data = suggestions.get(i).getText();
			System.out.println(data+"  ");
		}
	}

}
