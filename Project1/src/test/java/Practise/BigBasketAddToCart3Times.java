package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketAddToCart3Times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.bigbasket.com/");
int quantity=3;
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElement(By.xpath("//div[@class='Header___StyledQuickSearch-sc-19kl9m3-1 etaFQw']//input[@placeholder='Search for Products...']")).sendKeys("apple"+Keys.ENTER);
WebElement ele = driver.findElement(By.xpath("//div[@class='SKUDeck___StyledDiv-sc-1e5d9gk-0 eA-dmzP' and contains(.,'Apple - Royal Gala Economy')]/descendant::button[.='Add']"));
Actions a =new Actions(driver);
	a.scrollToElement(ele).perform();
	ele.click();
	for(;;)
	{
		try
		{
			WebElement presentQuantity = driver.findElement(By.xpath("//div[@class='SKUDeck___StyledDiv-sc-1e5d9gk-0 eA-dmzP' and contains(.,'Apple - Royal Gala Economy')]//span[.='"+quantity+"']"));
			if(presentQuantity.equals(quantity))
			{
				break;
			}
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//div[@class='SKUDeck___StyledDiv-sc-1e5d9gk-0 eA-dmzP' and contains(.,'Apple - Royal Gala Economy')]//*[name()='svg' and @class='CtaOnDeck___StyledPlusIcon-sc-orwifk-12 kyqQMg']")).click();
			
		}
	}
	}

}
