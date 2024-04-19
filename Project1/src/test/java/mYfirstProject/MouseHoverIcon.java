package mYfirstProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverIcon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/mouseHover?sublist=0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement mouse = driver.findElement(By.xpath("//img[@src='/assets/message-hint-J20Zlhln.png']"));
		Actions a=new Actions(driver);
		a.moveToElement(mouse).perform();
		List<WebElement> texts = driver.findElements(By.xpath("//div[@class='w-[30vw] absolute left-80 bg-white rounded-2xl shadow-md']//li"));
		for(WebElement Element:texts)
		{
			System.out.println(Element.getText());
		}
		driver.quit();
	}

}
