package Practise;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyntraAssignment {

	@Test
	public void myntra() throws InterruptedException
	{
	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
WebDriver driver=new ChromeDriver(option);
driver.get("https://www.myntra.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
WebElement homedecor = driver.findElement(By.xpath("//a[text()='Home & Living' and @data-group='home-&-living']"));
Thread.sleep(2000);
Actions a=new Actions(driver);
a.moveToElement(homedecor).perform();
List<WebElement> home = driver.findElements(By.xpath("//a[text()='Home Décor']/ancestor::li[@class='desktop-oddColumnContent']/descendant::a[@class='desktop-categoryLink']"));
for(WebElement lists:home)
{
	String data = lists.getText();
	System.out.println(data);
}
WebElement men = driver.findElement(By.xpath("//a[text()='Men' and @class='desktop-main']"));
a.moveToElement(men).perform();
driver.findElement(By.xpath("//ul[@class='desktop-navBlock']/descendant::li[@data-reactid='40']/a")).click();
List<WebElement> image = driver.findElements(By.xpath("//img"));
int count = image.size();
System.out.println(count);
WebElement sort = driver.findElement(By.xpath("//span[text()='Recommended']"));
a.moveToElement(sort).perform();
driver.findElement(By.xpath("//label[@class='sort-label ']/ancestor::ul[@class='sort-list']/descendant::li/label[text()='Customer Rating']")).click();
Thread.sleep(2000);
WebElement mangoman = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
mangoman.sendKeys("Mango-Man",Keys.ENTER);
Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("Mango Man - Buy Mango Man Apparels Online in India | Myntra");
assertTrue(verifyTitle);

List<WebElement> allSugg = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
for(WebElement sugg : allSugg) {
	String suggText = sugg.getText();
	if(suggText.equals("Mango Men Shirts")) {
		sugg.click();
		break;
	}
}
driver.findElement(By.xpath("(//li[@class='product-base']/child::a)[6]")).click();
Set<String> allWin = driver.getWindowHandles();
for(String wid : allWin) {	
	String widTitle = driver.switchTo().window(wid).getTitle();
	if(widTitle.contains("Buy MANGO MAN Slim Fit Performance Shirt"))
		break;
}
driver.findElement(By.xpath("//p[text()='M']")).click();
driver.findElement(By.xpath("//div[.='ADD TO BAG']")).click();
driver.findElement(By.xpath("//span[.='Bag']")).click();
String bagItemText = driver.findElement(By.xpath("(//div[@class='itemContainer-base-item '])[1]//div[@class='itemContainer-base-brand']")).getText();
if(bagItemText.contains("MANGO MAN"))
	System.out.println("Mango Man shirts is visible");
else
	System.out.println("Mango Man shirts is not visible");	

}
	}


