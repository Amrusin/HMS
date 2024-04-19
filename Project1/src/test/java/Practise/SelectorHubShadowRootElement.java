package Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorHubShadowRootElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://selectorshub.com/xpath-practice-page/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElement(By.xpath("//a[text()='PracticePage']")).click();
WebElement ShadElem1 = driver.findElement(By.xpath("//div[@id='userName']"));
SearchContext name = ShadElem1.getShadowRoot();
name.findElement(By.id("kils")).sendKeys("ABCD");
WebElement shadElem2 = name.findElement(By.cssSelector("#app2"));
SearchContext pizza = shadElem2.getShadowRoot();
Thread.sleep(1000);
pizza.findElement(By.id("pizza")).sendKeys("dominoz");

	}

}
